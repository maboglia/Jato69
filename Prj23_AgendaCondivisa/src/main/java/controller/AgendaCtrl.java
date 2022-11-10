package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class AgendaCtrl
 */
@WebServlet("/agenda")
public class AgendaCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgendaCtrl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//redirect
		//response.sendRedirect("agenda.jsp");
		
		//requestDispatcher  smistare la richiesta -> forward - include
		request.getRequestDispatcher("header.jsp").include(request, response);
		
		request.getRequestDispatcher("agenda.jsp").include(request, response);
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
	}



}
