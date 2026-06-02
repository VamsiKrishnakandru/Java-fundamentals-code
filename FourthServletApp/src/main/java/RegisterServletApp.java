

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class RegisterServletApp extends HttpServlet {

    public RegisterServletApp() 
    {
    	System.out.println("Servlet obj is created internally by container");
    }
    
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name=request.getParameter("uname");
		String ucity=request.getParameter("ucity");
		
		response.sendRedirect("/FourthServletApp/success.jsp");		
	}

}
