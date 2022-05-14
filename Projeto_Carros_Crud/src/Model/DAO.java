package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {
	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/carros?useTimezone=true&serverTimezone=UTC";
	private String user = "root";
	private String password = "";

	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	

	public ArrayList<CarroBeans> listarCarros() {
		ArrayList<CarroBeans> listaDeCarros = new ArrayList<>();
		
		String sql = "select pessoa.nome, pessoa.cpf, carro.placa, carro.renavam, marca.descricao, modelo.descricao "
				+ "from modelo join marca " + "on modelo.id_marca = marca.id " + "join carro "
				+ "on modelo.id = carro.id_modelo " + "join pessoa " + "on carro.id_pessoa = pessoa.id ";
		System.out.println(sql);
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();
			
			while (rst.next()) {
				PessoaBeans pessoa = new PessoaBeans(rst.getString(1), rst.getString(2));
				CarroBeans carro = new CarroBeans();
				MarcaBeans marca = new MarcaBeans(rst.getString(5));
				ModeloBeans modelo = new ModeloBeans(rst.getString(6), marca);
				carro.setPessoa(pessoa);
				carro.setModelo(modelo);
				carro.setRenavam(rst.getString(4));
				carro.setPlaca(rst.getString(3));
			listaDeCarros.add(carro);
			}
			con.close();

			return listaDeCarros;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	public void cadastrarCarro(CarroBeans carro) {
		String sql = "insert into carro (chassi, renavam, placa, ano, id_modelo, id_pessoa) values(?,?,?,?,?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, carro.getChassi());
			pst.setString(2, carro.getRenavam());
			pst.setString(3, carro.getPlaca());
			pst.setInt(4, carro.getAno());
			pst.setInt(5, carro.getIdModelo());
			pst.setInt(6, carro.getIdPessoa());
			pst.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
