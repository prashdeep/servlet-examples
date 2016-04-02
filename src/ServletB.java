import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletB extends HttpServlet  {
	
public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		
		PrintWriter out = res.getWriter();
		out.println("<h1>Came inside the ServletB class....</h1>");
	
		String username = (String)req.getAttribute("user");
		String password = (String)req.getAttribute("credentials");
		
		out.println("Username >> "+username + " Password  >> "+password);
	}

}
