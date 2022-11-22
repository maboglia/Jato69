package presentation;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.json.JSONArray;
import org.json.JSONObject;

import controller.ClienteController;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Cliente;

@WebServlet("/clienti")
public class ClienteREST extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private ClienteController ctrl = new ClienteController();
	
	public ClienteREST() {
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		resp.getWriter().append("<h1>Clienti</h1>");
		//req.getRequestDispatcher("cliente.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

	
	
}
