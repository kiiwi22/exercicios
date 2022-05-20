
package ajax;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

import Model.DAO;
import Model.MarcaBeans;
import Model.ModeloBeans;
import Model.PessoaBeans;

@WebServlet(urlPatterns = {"/ajax-marcas","/ajax-modelos", "/ajax-pessoas"})
public class AjaxHandler extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private final DAO dao = new DAO();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		System.out.println(action);
		switch(action) {
			case "/ajax-marcas":
				escreveMarcas(response);
				break;
			case "/ajax-modelos":
				escreveModelos(request,response);
			break;
			case "/ajax-pessoas":
				escrevePessoas(request,response);
			break;
		}
		
	}

	private void escreveModelos(HttpServletRequest request, HttpServletResponse response) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Integer idMarca = Integer.parseInt(request.getParameter("id-marca"));
		List<ModeloBeans> modelos = dao.getModelosPorMarca(idMarca);
		response.setContentType("application/json");
		response.getWriter().write(mapper.writeValueAsString(modelos));
	}
	
	private void escreveMarcas(HttpServletResponse response) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		List<MarcaBeans> marcas = dao.getMarcas();
		
		response.setContentType("application/json");
		response.getWriter().write(mapper.writeValueAsString(marcas));
	}
	
	private void escrevePessoas(HttpServletRequest request, HttpServletResponse response) throws IOException{
		ObjectMapper mapper = new ObjectMapper();
		List<PessoaBeans> pessoas = dao.getPessoas();
		System.out.println(pessoas);
		response.setContentType("application/json");
		response.getWriter().write(mapper.writeValueAsString(pessoas));
	}
	
}