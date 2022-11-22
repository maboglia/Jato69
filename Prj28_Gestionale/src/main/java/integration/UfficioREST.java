package integration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

import org.json.JSONArray;

import controller.HubUffici;

/**
 * Servlet implementation class UfficioCtrl
 */

@WebServlet("/api/uffici")
public class UfficioREST extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private HubUffici ctrl = new HubUffici();

	public UfficioREST() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		JSONArray array = new JSONArray(ctrl.getUfficio());
		
		response.setContentType("application/json");
		response.getWriter().append(array.toString());
	
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
