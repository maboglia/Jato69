package presentation;

import jakarta.servlet.RequestDispatcher;
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
		
		
		request.getRequestDispatcher("main/header.jsp").include(request, response);
		request.getRequestDispatcher("main/menu.jsp").include(request, response);
		
		response.getWriter().append("<h1>Articoli</h1>");
		
		request.setAttribute("elenco", this.ctrl.getArticoli());
		
		request.getRequestDispatcher("articoli/list.jsp").include(request, response);
		
		request.getRequestDispatcher("main/footer.jsp").include(request, response);
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		doGet(request, response);
	}

}
