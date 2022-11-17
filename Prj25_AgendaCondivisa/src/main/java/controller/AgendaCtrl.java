package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Agenda;

import java.io.IOException;
import java.time.LocalTime;

/**
 * Servlet implementation class AgendaCtrl
 */
@WebServlet("/agenda")
public class AgendaCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private Agenda agenda= new Agenda();
	
	
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
		// TODO Auto-generated method stub
//		response.setCharacterEncoding("utf-8");
//		response.getWriter().append("siamo spiacenti, il servizio non è disponibile ");
		//response.sendRedirect("agenda.jsp");
//		agenda.addAppuntamento("java");
//		agenda.addAppuntamento("javascrpt");
//		agenda.addAppuntamento("sql");

		HttpSession session = request.getSession();
		request.getRequestDispatcher("header.jsp").include(request, response);
		request.getRequestDispatcher("menu.jsp").include(request, response);
		
		if (session.getAttribute("loggato")!=null && session.getAttribute("loggato").equals("okkkei") ) {
			System.out.println("sei loggato");
			request.setAttribute("elencoAppuntamenti", agenda.getAppuntamenti());
			
			request.getRequestDispatcher("formAddAppuntamento.jsp").include(request, response);
			request.getRequestDispatcher("agenda.jsp").include(request, response);
		} else {
			response.getWriter().append("<h1> NON puoi entrare! Rifai il login </h1>");
		}
		
		request.getRequestDispatcher("footer.jsp").include(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String descrizione = request.getParameter("descrizione");
		if(descrizione.equals("")) {
			descrizione="java";
		}
		if (request.getParameter("ora")!=null && !request.getParameter("ora").equals("")) {
			System.out.println();
			
			String oraString = request.getParameter("ora");
			String oreMin[] = oraString.split(":");
			LocalTime ora= LocalTime.of(Integer.parseInt(oreMin[0]), Integer.parseInt(oreMin[1]));
			agenda.addAppuntamento(descrizione,ora);
		}else {
			agenda.addAppuntamento(descrizione);
		}
		doGet(request, response);
		
	}	

}
