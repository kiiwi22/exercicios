package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DAO {

	private String driver = "com.mysql.cj.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/dbagenda?useTimezone=true&serverTimezone=UTC";
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

	public void inserirContato(JavaBeans contato) {
		String sql = "INSERT INTO CONTATOS (nome, fone, email) VALUES(?,?,?)";
		try {
			// conectar com o banco
			Connection con = conectar();
			// preparar a query para execução no banco de dados
			PreparedStatement pst = con.prepareStatement(sql);
			// substituir os parametros (as interrogações) pelo conteúdo das variáveis
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			// executar a query
			pst.executeUpdate();
			// encerrando a conexão com o banco
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public ArrayList<JavaBeans> listarContatos() {
		// cria a lista que vai receber os contatos do banco
		ArrayList<JavaBeans> listaDeContatos = new ArrayList<>();
		// String da query
		String sql = "select * from contatos order by nome";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();

			// laço para pegar os dados de cada contato do banco e adicionar em variaveis
			// temporarias
			while (rst.next()) {
				String idcon = rst.getString(1);
				String nome = rst.getString(2);
				String fone = rst.getString(3);
				String email = rst.getString(4);

				// criando um novo objeto JavaBeans e povoando com os dados vindos do banco
				listaDeContatos.add(new JavaBeans(idcon, nome, fone, email));
			}
			con.close();
			return listaDeContatos;

		} catch (Exception e) {
			System.out.println(e);
			return null;
		}

	}

	// seleciona o contato do bando atraves do id passado pelo jsp (método
	// listarContatos() da classe Controller
	public void selecionarContato(JavaBeans contato) {
		String sql = "select * from contatos where idcon=?";

		try {
			// fazendo a busca do contato no banco através do idcon que veio do jsp
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			// setando o idcon vindo do jsp na interrogação da query
			pst.setString(1, contato.getIdcon());
			ResultSet rst = pst.executeQuery();

			// setando os dados vindos do banco no obj contato da classe JavaBeans
			while (rst.next()) {
				contato.setIdcon(rst.getString(1));
				contato.setNome(rst.getString(2));
				contato.setFone(rst.getString(3));
				contato.setEmail(rst.getString(4));
			}
			con.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	// Altera as informações do contato
	public void alterarContato(JavaBeans contato) {
		String sql = "update contatos set nome=?, fone=?, email=? where idcon=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, contato.getNome());
			pst.setString(2, contato.getFone());
			pst.setString(3, contato.getEmail());
			pst.setString(4, contato.getIdcon());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void deletaContado(JavaBeans contato) {
		String sql = "delete from contatos where idcon=?";
		try {
			Connection con = conectar();
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, contato.getIdcon());
			pst.executeUpdate();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
