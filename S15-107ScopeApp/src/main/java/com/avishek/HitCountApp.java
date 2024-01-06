package com.avishek;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hit")
public class HitCountApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		ServletContext contex = getServletContext();
		Integer count = (Integer)contex.getAttribute("hitcount");
		if(count == null)
			count = 1;
		else
			count++;
		
		contex.setAttribute("hitcount", count);
		out.println("<h1> Hit count of the application is ::: "+count+"</h1>");
		out.close();
	}

}
