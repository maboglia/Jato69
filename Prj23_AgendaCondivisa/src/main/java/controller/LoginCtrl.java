package controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginCtrl extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest richiesta, HttpServletResponse risposta) throws ServletException, IOException {
		System.out.println("mi hai chiamato via GET");
//		risposta.setContentType("text/html");//MIME type
//		risposta.getWriter().append("<h1>ciao, sono il metodo get ;)</h1>"); 
		
		risposta.sendRedirect("formLogin.jsp");
	}

	@Override
	protected void doPost(HttpServletRequest richiesta, HttpServletResponse risposta) throws ServletException, IOException {
		
		String username = richiesta.getParameter("username");
		String password = richiesta.getParameter("password");
		
		if (username.equals("mauro") && password.equals("12345")) {
			
			richiesta.getRequestDispatcher("areaRiservata.jsp").forward(richiesta, risposta);
			
			//risposta.sendRedirect("areaRiservata.jsp");
		}
		else {
			doGet(richiesta, risposta);
		}
		//System.out.println("mi hai chiamato via POST: " + username);
	}
	
}
