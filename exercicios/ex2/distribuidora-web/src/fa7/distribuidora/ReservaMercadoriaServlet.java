package fa7.distribuidora;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReservaMercadoriaServlet
 */
@WebServlet("/ReservaMercadoriaServlet")
public class ReservaMercadoriaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	@EJB ControladorEstoqueSSB controle;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReservaMercadoriaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String merc = request.getParameter("mercadoria");
		int qtde = Integer.parseInt(request.getParameter("qtde"));
		int reservado = controle.reservarMercadoria(merc, qtde);
		PrintWriter writer = response.getWriter();		
		writer.append("<html><body><h1>Aplicacao</h1><br><h2>");
		writer.append("Mercadoria " + merc + " teve ");
		writer.append(Integer.toString(reservado) + " itens reservados.");
		writer.append("</h2></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
