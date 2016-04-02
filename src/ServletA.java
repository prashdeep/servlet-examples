import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletA extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out = res.getWriter();
		out.println("<h1>Came inside the ServletA class....</h1>");
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		req.setAttribute("user", username);
		req.setAttribute("credentials", password);
		
		RequestDispatcher rd = req.getRequestDispatcher("forward");
		rd.forward(req, res);
	}

}
