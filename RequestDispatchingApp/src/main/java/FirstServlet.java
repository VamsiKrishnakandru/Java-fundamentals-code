

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet 
{
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		System.out.println("Control in first Servlet");
		
		String name = request.getParameter("uname");
		//String city = request.getParameter("ucity");
		
		RequestDispatcher reqDispatch = request.getRequestDispatcher("/SecondServlet");
		
		HttpSession session=request.getSession();
		session.setAttribute("name", name);
		//data stored in session will expire in 10 secs
		session.setMaxInactiveInterval(10000);
		
		reqDispatch.forward(request, response);
	}
}
