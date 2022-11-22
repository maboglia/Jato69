package integration;

import java.io.IOException;

import org.json.JSONArray;

import controller.OrdineCtrl;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/api/ordini")
public class OrdineREST extends HttpServlet{

	OrdineCtrl ctrl = new OrdineCtrl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		JSONArray array = new JSONArray(ctrl.getOrdini());
		
		response.setContentType("application/json");
		response.getWriter().append(array.toString());
	}
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
	

}
