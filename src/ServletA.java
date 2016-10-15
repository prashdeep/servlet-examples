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
		
		out.println("<h2>User name "+username+"</h2>");
		out.println("<h2><b><u>password > "+password+"</u></b></h2>");

		req.setAttribute("user", username);
		req.setAttribute("credentials", password);
		
		//res.sendRedirect("http://www.google.com");
		
		RequestDispatcher rd = req.getRequestDispatcher("forward");
		rd.forward(req, res);
	}

}
