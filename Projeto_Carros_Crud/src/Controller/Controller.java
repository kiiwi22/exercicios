package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.CarroBeans;
import Model.DAO;



@WebServlet(urlPatterns = { "/Controller", "/main", "/insert"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	CarroBeans carro = new CarroBeans();
	
	DAO dao = new DAO();
   
    public Controller() {
        super(); 
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			listaCarros(request, response);
		} else if (action.equals("/insert")) {
			cadastraCarro(request, response);
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
				throws ServletException, IOException{
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
			
		}
	
}
