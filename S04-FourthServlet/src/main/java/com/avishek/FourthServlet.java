package com.avishek;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/test")
public class FourthServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		PrintWriter out = res.getWriter();
		out.println("<html>");
		out.println("<center><h1>Writing Servlet using Generic Servlet is easy...</h1></center>");
		out.println("<center><h2>Writing Servlet using Generic Servlet is easy...</h2></center>");
		out.println("<center><h3>Writing Servlet using Generic Servlet is easy...</h3></center>");
		out.println("<center><h4>Writing Servlet using Generic Servlet is easy...</h4></center>");
		out.println("<center><h5>Writing Servlet using Generic Servlet is easy...</h5></center>");
		out.println("<center><h6>Writing Servlet using Generic Servlet is easy...</h6></center>");
		out.println("<center><h6>Writing Servlet using Generic Servlet is easy...</h6></center>");
		out.println("<center><h5>Writing Servlet using Generic Servlet is easy...</h5></center>");
		out.println("<center><h4>Writing Servlet using Generic Servlet is easy...</h4></center>");
		out.println("<center><h3>Writing Servlet using Generic Servlet is easy...</h3></center>");
		out.println("<center><h2>Writing Servlet using Generic Servlet is easy...</h2></center>");
		out.println("<center><h1>Writing Servlet using Generic Servlet is easy...</h1></center>");
		out.println("</html>");
		
		out.close();
	}
       

}
