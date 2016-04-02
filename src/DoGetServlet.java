import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DoGetServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		System.out.println("Came inside the doGetServlet class....");
		PrintWriter out = res.getWriter();
		out.println("<h1>Printing the response</h1>");
		String city = req.getParameter("city");
		String country = req.getParameter("country");
		
		out.println("<h4>City >>  "+city+ " Country >> "+country+" </h4>");
	}

}
