package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/login")
public class LoginCtrl extends HttpServlet 	 {
	
	AgendaCtrl aCtrl = new AgendaCtrl(); 
	@Override
	protected void doGet(HttpServletRequest richiesta, HttpServletResponse risposta) throws ServletException, IOException {
//		System.out.println("mi hai chaimato via get");
//		risposta.setContentType("text/html");// MIME type
//		risposta.getWriter().append("<h1>ciao , sono eclpse ;)<h1>");
		//risposta.sendRedirect("formLogin.jsp");
		
		richiesta.getRequestDispatcher("header.jsp").include(richiesta, risposta);
		richiesta.getRequestDispatcher("formLogin.jsp").include(richiesta, risposta);
		richiesta.getRequestDispatcher("footer.jsp").include(richiesta, risposta);
		}

	@Override
	protected void doPost(HttpServletRequest richiesta, HttpServletResponse risposta) throws ServletException, IOException {
		//System.out.println("mi hai chaimato via post");
		String username= richiesta.getParameter("username");
		String password= richiesta.getParameter("password");
		
		if (username.contentEquals("momo") && password.contentEquals("123")) {

			richiesta.getRequestDispatcher("header.jsp").include(richiesta, risposta);
			richiesta.getRequestDispatcher("areaRiservata.jsp").include(richiesta, risposta);
			aCtrl.doGet(richiesta, risposta);
			richiesta.getRequestDispatcher("footer.jsp").include(richiesta, risposta);
			//risposta.sendRedirect("areaRiservata.jsp");
		}else {
			 doGet(richiesta, risposta);
		}
		
		
	}

	
	
}
