import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class JSTLDemoServlet extends HttpServlet {private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	List<Employee> empList = new ArrayList<Employee>();
	Employee emp1 = new Employee();
	emp1.setId(1); emp1.setName("Pradeep");
	emp1.setRole("Developer");
	
	Employee emp2 = new Employee();
	emp2.setId(2); emp2.setName("Kiran");emp2.setRole("QA");
	
	empList.add(emp1);
	empList.add(emp2);
	empList.add(emp2);
	empList.add(emp2);
	empList.add(emp2);
	empList.add(emp2);
	
	
	request.setAttribute("empList", empList);
	
	request.setAttribute("htmlTagData", "<br/> creates a new line.");
	request.setAttribute("url", "http://www.edureka.co");
	RequestDispatcher rd = getServletContext().getRequestDispatcher("/views/jstl_demo.jsp");
	rd.forward(request, response);
}}
