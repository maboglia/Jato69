package integration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Articolo;

import java.io.BufferedReader;
import java.io.IOException;

import org.json.HTTP;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;

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

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		//mi faccio ritornare la stringa in json    
		BufferedReader reader = req.getReader();
		
		//creo un gson
		Gson gson = new Gson();
		
		//riverso i dati nel gson
		Articolo a = gson.fromJson(reader, Articolo.class);
		
		//modifico il record usando il ctrl
		this.ctrl.updateArticolo(a);
		
	}
	

}
