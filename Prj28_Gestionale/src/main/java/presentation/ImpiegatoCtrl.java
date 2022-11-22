package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import org.json.JSONArray;

import controller.Personale;

/**
 * Servlet implementation class ImpiegatoCtrl
 */
@WebServlet("/impiegati")
public class ImpiegatoCtrl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Personale ctrl = new Personale();
	
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
				
		response.setContentType("text/html");
		
		response.getWriter().append("<h1>Impiegati</h1>");

	}
    
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
  		
    }

}
