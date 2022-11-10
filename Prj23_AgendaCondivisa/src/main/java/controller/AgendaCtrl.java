package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Agenda;

import java.io.IOException;

/**
 * Servlet implementation class AgendaCtrl
 */
@WebServlet("/agenda")
public class AgendaCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	private Agenda agenda;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgendaCtrl() {
        super();
        agenda = new Agenda();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//redirect
		//response.sendRedirect("agenda.jsp");
		
		agenda.addAppuntamento("java");
		agenda.addAppuntamento("javascript");
		agenda.addAppuntamento("sql");
		
		request.setAttribute("elencoAppuntamenti", agenda.getAppuntamenti());
		
		
		//requestDispatcher  smistare la richiesta -> forward - include
		request.getRequestDispatcher("header.jsp").include(request, response);
		
		request.getRequestDispatcher("agenda.jsp").include(request, response);
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
		
	}



}
