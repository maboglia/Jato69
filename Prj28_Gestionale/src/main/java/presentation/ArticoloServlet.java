package presentation;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Articolo;

import java.io.IOException;

import org.json.JSONArray;

import controller.ArticoloCtrl;


@WebServlet("/articoli")
public class ArticoloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private ArticoloCtrl ctrl;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ArticoloServlet() {
        super();
        this.ctrl = new ArticoloCtrl();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		response.getWriter().append("<h1>Articoli</h1>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		doGet(request, response);
	}

}
