package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert", "/select", "/update", "/delete" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	JavaBeans contato = new JavaBeans();
	DAO dao = new DAO();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		if (action.equals("/main")) {
			contatos(request, response);
		} else if (action.equals("/insert")) {
			novoContato(request, response);
		} else if (action.equals("/select")) {
			listarContato(request, response);
		} else if (action.equals("/update")) {
			editarContato(request, response);
		} else if (action.equals("/delete")) {
			removeContato(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

	// listar a tabela de contatos
	protected void contatos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<JavaBeans> lista = dao.listarContatos();
		// encaminhar a lista ao documento agenda.jsp
		// 1º passo - setando os atrisbutos da lista no agenda.jsp
		request.setAttribute("contatos", lista);
		// 2º passo - despachar a lista para o documento agenda.jsp
		RequestDispatcher rd = request.getRequestDispatcher("agenda.jsp");
		rd.forward(request, response);

	}

	// novo contato
	protected void novoContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// setar os parametros vindos de "novo.html" na classe JavaBeans
		contato.setNome(request.getParameter("nome"));
		contato.setFone(request.getParameter("fone"));
		contato.setEmail(request.getParameter("email"));
		// chamar o metodo inserirContato passando o objeto contato
		dao.inserirContato(contato);
		// redirecionar para "agenda.jsp"
		response.sendRedirect("main");
	}

	// lista contato no editar.jsp para ser manipulado
	protected void listarContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recebendo o id do contato que será editado
		String idcon = request.getParameter("idcon");

		// setando a variavel recebida no objeto JavaBeans
		contato.setIdcon(idcon);
		dao.selecionarContato(contato);

		// setar os atributos do contato dentro do jsp
		request.setAttribute("idcon", contato.getIdcon());
		request.setAttribute("nome", contato.getNome());
		request.setAttribute("fone", contato.getFone());
		request.setAttribute("email", contato.getEmail());

		// Encaminhar ao documento editar.jsp
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);
	}

	protected void editarContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// setar as variáveis vindas do jsp no JavaBeans
		contato.setIdcon(request.getParameter("idcon"));
		contato.setNome(request.getParameter("nome"));
		contato.setFone(request.getParameter("fone"));
		contato.setEmail(request.getParameter("email"));

		// executar o método alterarContato da classe DAO
		dao.alterarContato(contato);

		// redirecionar para o documento agenda.jsp (com a tabela atualizada)
		response.sendRedirect("main");
	}

	protected void removeContato(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recebimento do id do contato a ser excluido (confirmador.js)
		String idcon = request.getParameter("idcon");
		System.out.println(idcon);
		// setar a variavel idcon no objeto contato JavaBeans
		contato.setIdcon(idcon);
		// executar o metodo deletaContato() da classe DAO passando o objeto contato
		// JavaBeans
		dao.deletaContado(contato);
		// redirecionar para o documento agenda.jsp (com a tabela atualizada)
		response.sendRedirect("main");
	}

}
