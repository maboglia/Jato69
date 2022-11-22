package integration;

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
@WebServlet("/api/impiegati")
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
				
    	JSONArray array = new JSONArray(ctrl.getImpiegati());
		
		response.setContentType("application/json");
		response.getWriter().append(array.toString());
	}
    
    @Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
  		
    }

}
