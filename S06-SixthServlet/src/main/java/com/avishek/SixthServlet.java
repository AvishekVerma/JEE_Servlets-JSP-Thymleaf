package com.avishek;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reg")
public class SixthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		
		System.out.println("Request type is :: "+request.getMethod());
		
		String username = request.getParameter("username");
		String useremail = request.getParameter("usermail");
		String useraddr = request.getParameter("useraddr");
		String[] courses = request.getParameterValues("course");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Output</title><head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>Student Registation details</h1>");
		out.println("<table border='1'>");
		out.println("<tr><th>Name</th><td>"+username+"</td></tr>");
		out.println("<tr><th>Email</th><td>"+useremail+"</td></tr>");
		out.println("<tr><th>Addr</th><td>"+useraddr+"</td></tr>");
		out.println("<tr><th>Course</th>");
		String data = "";
		for(String course:courses)
			data +=course+" ";
		
		out.println("<td>"+data+"</td>");
		out.println("</tr>");
		out.println("</center>");
		out.println("<body>");
		out.println("<html>");
		
		out.close();
	
	}

}
