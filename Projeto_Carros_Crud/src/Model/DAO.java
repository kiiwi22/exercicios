package Model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

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

		String sql = "select pessoa.nome, pessoa.cpf, carro.placa, carro.renavam, marca.descricao, modelo.descricao, carro.id, carro.ano "
				+ "from modelo join marca " + "on modelo.id_marca = marca.id " + "join carro "
				+ "on modelo.id = carro.id_modelo " + "join pessoa " + "on carro.id_pessoa = pessoa.id ";
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
				carro.setId(rst.getInt(7));
				carro.setAno(rst.getInt(8));
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
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void selecionaCarroDAO(CarroBeans carro) {
		String sql = "select carro.id, carro.chassi, carro.ano, carro.placa, carro.renavam, marca.descricao, modelo.descricao "
				+ "from modelo join marca " + "on modelo.id_marca = marca.id " + "join carro "
				+ "on modelo.id = carro.id_modelo where carro.id=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, carro.getId());
			ResultSet rst = pst.executeQuery();

			while (rst.next()) {

				MarcaBeans marca = new MarcaBeans(rst.getString(6));
				ModeloBeans modelo = new ModeloBeans(rst.getString(7), marca);
				carro.setId(rst.getInt(1));
				carro.setChassi(rst.getString(2));
				carro.setAno(rst.getInt(3));
				carro.setPlaca(rst.getString(4));
				carro.setRenavam(rst.getString(5));
				carro.setModelo(modelo);
				carro.setId(rst.getInt(7));

			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void alteraCarroDAO(CarroBeans carro) {
		String sql = "update carro set chassi=?, ano=?, placa=?, renavam=? where id=?";

		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, carro.getChassi());
			pst.setInt(2, carro.getAno());
			pst.setString(3, carro.getPlaca());
			pst.setString(4, carro.getRenavam());
			pst.setInt(5, carro.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void cadastraPessoa(PessoaBeans pessoa) {
		String sql = "insert into pessoa (nome, cpf, data_nascimento, sexo) values(?,?,?,?)";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, pessoa.getNome());
			pst.setString(2, pessoa.getCpf());
			pst.setDate(3, pessoa.getData());
			pst.setString(4, pessoa.getSexo());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public ArrayList<PessoaBeans> listarPessoas() {
		ArrayList<PessoaBeans> listaDePessoas = new ArrayList<>();

		String sql = "select * from pessoa order by nome";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();

			while (rst.next()) {
				Integer id = rst.getInt(1);
				String nome = rst.getString(2);
				String cpf = rst.getString(3);
				Date data = rst.getDate(4);
				String sexo = rst.getString(5);

				listaDePessoas.add(new PessoaBeans(id, nome, cpf, data, sexo));
			}
			con.close();

			return listaDePessoas;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}

	public void deletaCarro(CarroBeans carro) {
		String sql = "delete from carro where id=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, carro.getId());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public List<ModeloBeans> getModelosPorMarca(Integer idMarca) {
		String sql = "select id, descricao, id_marca from modelo where id_marca = ?";
		List<ModeloBeans> modelos = new ArrayList<>();
		try (Connection con = conectar();) {
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, idMarca);
			ResultSet rs = st.executeQuery();
			while (rs.next()) {
				modelos.add(new ModeloBeans(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
			rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return modelos;
	}
	
	public List<MarcaBeans> getMarcas(){
		final String sql = "select id, descricao from marca";
		List<MarcaBeans> marcas = new ArrayList<>();
		try (Connection con = conectar(); Statement st = con.createStatement()) {
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				marcas.add(new MarcaBeans(rs.getInt(1), rs.getString(2)));
			}
			rs.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		return marcas;
	}
}
