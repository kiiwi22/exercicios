package Controller;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CarroBeans;
import Model.DAO;
import Model.PessoaBeans;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert", "/select", "/update", "/insertPessoa", "/listaPessoas",
		"/deleteCarro" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private final CarroBeans carro = new CarroBeans();
	private final PessoaBeans pessoa = new PessoaBeans();

	private final DAO dao = new DAO();

	public Controller() {
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			listaCarros(request, response);
		} else if (action.equals("/insert")) {
			cadastraCarro(request, response);
		} else if (action.equals("/insertPessoa")) {
			cadastraPessoa(request, response);
		} else if (action.equals("/listaPessoas")) {
			listaPessoas(request, response);
		} else if (action.equals("/select")) {
			selecionaCarro(request, response);
		} else if (action.equals("/update")) {
			alteraCarro(request, response);
		} else if (action.equals("/deleteCarro")) {
			deletaCarro(request, response);
		}
	}

	// listar a tabela de carros
	protected void listaCarros(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<CarroBeans> lista = dao.listarCarros();
		request.setAttribute("carros", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listaDeCarros.jsp");
		rd.forward(request, response);

	}

	protected void cadastraCarro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String chassi = request.getParameter("chassi");
		String placa = request.getParameter("placa");
		String renavam = request.getParameter("renavam");
		String anoParametro = request.getParameter("ano");
		String idPessoaParametro = request.getParameter("idPessoa");
		String idModeloParametro = request.getParameter("idModelo");
		Integer ano = Integer.valueOf(anoParametro);
		Integer idModelo = Integer.valueOf(idModeloParametro);
		Integer idPessoa = Integer.valueOf(idPessoaParametro);

		carro.setAno(ano);
		carro.setChassi(chassi);
		carro.setPlaca(placa);
		carro.setRenavam(renavam);
		carro.setIdModelo(idModelo);
		carro.setIdPessoa(idPessoa);

		dao.cadastrarCarro(carro);

		response.sendRedirect("main");

	}

	protected void selecionaCarro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idCarroString = request.getParameter("idcarro");
		Integer idCarro = Integer.valueOf(idCarroString);
		carro.setId(idCarro);
		dao.selecionaCarroDAO(carro);

		request.setAttribute("idCarro", carro.getId());
		request.setAttribute("chassi", carro.getChassi());
		request.setAttribute("ano", carro.getAno());
		request.setAttribute("placa", carro.getPlaca());
		request.setAttribute("renavam", carro.getRenavam());
		request.setAttribute("marca", carro.getModelo().getMarca().getDescricao());
		request.setAttribute("modelo", carro.getModelo().getDescricao());

		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);
	}

	protected void cadastraPessoa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		pessoa.setNome(request.getParameter("nome"));
		pessoa.setCpf(request.getParameter("cpf"));
		pessoa.setSexo(request.getParameter("sexo"));
		String nascimentoString = request.getParameter("dataNascimento");
		Date dataNascimento = Date.valueOf(nascimentoString);
		pessoa.setData(dataNascimento);

		dao.cadastraPessoa(pessoa);

		response.sendRedirect("listaPessoas");

	}

	protected void listaPessoas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ArrayList<PessoaBeans> lista = dao.listarPessoas();
		request.setAttribute("pessoas", lista);
		RequestDispatcher rd = request.getRequestDispatcher("listaDePessoas.jsp");
		rd.forward(request, response);
	}

	protected void alteraCarro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idCarroString = request.getParameter("idCarro");
		Integer idCarro = Integer.valueOf(idCarroString);
		String chassi = request.getParameter("chassi");
		String anoString = request.getParameter("ano");
		Integer ano = Integer.valueOf(anoString);
		String placa = request.getParameter("placa");
		String renavam = request.getParameter("renavam");
		String marca = request.getParameter("marca");
		String modelo = request.getParameter("modelo");
		carro.setId(idCarro);
		carro.setChassi(chassi);
		carro.setAno(ano);
		carro.setPlaca(placa);
		carro.setRenavam(renavam);
		carro.getModelo().getMarca().setDescricao(marca);
		carro.getModelo().setDescricao(modelo);

		dao.alteraCarroDAO(carro);

		response.sendRedirect("main");

	}

	protected void deletaCarro(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String idString = request.getParameter("idcarro");
		Integer idCarro = Integer.valueOf(idString);
		carro.setId(idCarro);
		dao.deletaCarro(carro);
		response.sendRedirect("main");
	}

}
