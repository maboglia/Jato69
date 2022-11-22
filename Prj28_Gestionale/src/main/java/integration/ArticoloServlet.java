package integration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Articolo;

import java.io.IOException;

import org.json.JSONArray;

import controller.ArticoloCtrl;


@WebServlet("/api/articoli")
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
		
		JSONArray array = new JSONArray(this.ctrl.getArticoli());
		
		response.setContentType("application/json");
		response.getWriter().append(array.toString());
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		doGet(request, response);
	}

}
