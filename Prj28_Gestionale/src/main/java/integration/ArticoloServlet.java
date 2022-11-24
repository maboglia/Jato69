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
		
		System.out.println(req.getContentType());
		
		StringBuilder jb = new StringBuilder();
		  String line = null;
		  try {
		    BufferedReader reader = req.getReader();
		    while ((line = reader.readLine()) != null)
		      jb.append(line);
		  } catch (Exception e) { /*report an error*/ }

		  try {
		    JSONObject jsonObject =  HTTP.toJSONObject(jb.toString());
		    
		    
		    
		    
		    resp.getWriter().append(jsonObject.toString());
		    
		  } catch (JSONException e) {
		    // crash and burn
		    throw new IOException("Error parsing JSON request string");
		  }		
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
