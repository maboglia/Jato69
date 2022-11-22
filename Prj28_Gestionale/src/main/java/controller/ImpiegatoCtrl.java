package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class ImpiegatoCtrl
 */
@WebServlet("/impiegato")
public class ImpiegatoCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Personale personale = new Personale();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ImpiegatoCtrl() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		request.getRequestDispatcher("header.jsp").include(request, response);	

		request.getRequestDispatcher("footer.jsp").include(request, response);
		
	}
    
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
  		
    }

}
