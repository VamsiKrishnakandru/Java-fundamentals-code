

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String url = "jdbc:mysql://localhost:3306/tron_db";
		String user = "root";
		String pwd = "root123";
		
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String ucity = request.getParameter("ucity");
		int count = 0;
		PrintWriter writer = response.getWriter();
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connect = DriverManager.getConnection(url,user,pwd);
			PreparedStatement stm = connect.prepareStatement("INSERT INTO register (uname, email, upassword, ucity)"
					+ " VALUES (?,?,?,?)");
			stm.setString(1, uname);
			stm.setString(2, email);
			stm.setString(3, password);
			stm.setString(4, ucity);
			count = stm.executeUpdate();
			
			if(count != 0)
				writer.print("<H1>Success!</H1>");
			else
				writer.print("<H1>Failed!</H1>");
			connect.close();
			writer.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
