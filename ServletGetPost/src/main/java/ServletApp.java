

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/ServletApp")
public class ServletApp extends HttpServlet {
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Control in Servlet/controller");
		
		String name = request.getParameter("uname");
		String city = request.getParameter("ucity");
		
		if(name.equals("Rohan") && city.equals("Pune"))
		{
			System.out.println("Success! He is the right rohan logged in");
		}
		else
			System.out.println("Diff Rohan logged in");
	}

}
