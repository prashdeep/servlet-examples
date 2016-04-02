import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	Connection con = null;
	PreparedStatement ps = null;
	String query = "insert into student (number, name) values (?,?)";

	@Override
	public void init() {
		ServletConfig config = getServletConfig();

		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded...");

			con = DriverManager.getConnection(config.getInitParameter("url"), config.getInitParameter("username"),
					config.getInitParameter("password"));
			System.out.println("Connected to the database");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) {
		try {
			ps = con.prepareStatement(query);

			String name1 = "Ramnaresh";
			ps.setString(2, name1);
			ps.setString(1, "10");
			ps.addBatch();

			int[] results = ps.executeBatch();

			System.out.println(Arrays.toString(results));
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void destroy() {
		System.out.println("Printing from the destroy method....");
	}

}
