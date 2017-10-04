package uni7.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.Set;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReservaServlet
 */
@WebServlet("/ReservaServlet")
public class ReservaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject private ControleReserva controle;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ReservaServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String acao = request.getParameter("acao");
		if ("reservar".equalsIgnoreCase(acao)) {
			controle.reservar();
		} else if ("listar".equalsIgnoreCase(acao)) {
			Set<Entry<String, Integer>> mercadorias = controle.listar();
			PrintWriter writer = response.getWriter();
			writer.append("<html><body><h1>Estoque</h1><br>");
			mercadorias.forEach((k) -> {
				writer.append("<h2>Mercadoria: " + k.getKey() + " Qtde: " + k.getValue() + "</h2><br>");
			});
			writer.append("</body></html>");
		} else {
			String merc = request.getParameter("merc");
			int qtde = Integer.parseInt(request.getParameter("qtde"));
			controle.incluir(merc, qtde);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
