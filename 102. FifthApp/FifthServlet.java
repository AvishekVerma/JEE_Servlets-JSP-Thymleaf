import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(urlPatterns="/test")
public class FifthServlet extends HttpServlet
{
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException 
	{
		System.out.println("Request method is of type :: GET");
		String userName=request.getParameter("username");
		System.out.println("userName is  ::"+userName);
	}

	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException 
	{
		System.out.println("Request method is of type :: POST");
		String userName=request.getParameter("username");
		System.out.println("userName is  ::"+userName);
	}
}