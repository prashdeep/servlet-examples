import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoPostServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		System.out.println("Came inside the doGetServlet class....");
		PrintWriter out = res.getWriter();
		out.println("<h1>Printing the response</h1>");
		String username = req.getParameter("username");
		String password = req.getParameter("password");

		out.println("<h4>username >>  " + username + " password >> " + password + " </h4>");
	}
}
