package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Servlet implementation class UfficioCtrl
 */

@WebServlet("/ufficio")
public class UfficioCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HubUffici ufficio = new HubUffici();

	public UfficioCtrl() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//HttpSession session = request.getSession();
		request.getRequestDispatcher("header.jsp").include(request, response);

		request.getRequestDispatcher("ufficio.jsp").include(request, response);

		request.getRequestDispatcher("formUfficio.jsp").include(request, response);

		request.getRequestDispatcher("footer.jsp").include(request, response);

		// if (session.getAttribute(descrizione)!=null) {
		// System.out.println("l'ufficio non esiste");
		//
		// request
		// .getRequestDispatcher("formUfficio.jsp").include(request, response);
		//
		// request
		// .getRequestDispatcher("ufficio.jsp").include(request, response);
		// } else {
		// response.getWriter().append("qualcosa");
		// }
		// request.getRequestDispatcher("footer.jsp").include(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nome=request.getParameter("nome");
		String telefono=request.getParameter("telefono");
		String indirizzo=request.getParameter("indirizzo");
		String citta=request.getParameter("citta");
		String regione=request.getParameter("regione");
		ufficio.addUfficio(nome, telefono, indirizzo, citta, regione);
		doGet(request, response);

	}

}
