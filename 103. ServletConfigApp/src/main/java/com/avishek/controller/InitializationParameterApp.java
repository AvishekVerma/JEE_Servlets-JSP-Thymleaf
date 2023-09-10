package com.avishek.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitializationParameterApp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		out.println("<h1 style='text-align:center;'>Initializiation Parameters</h1><hr/>");
		out.println("<table border='1'>");
		out.println("<tr><th>Parameter Name</th><th>Parameter Value</th></tr>");
		
		Enumeration<String> paraNames = getInitParameterNames();
		while(paraNames.hasMoreElements()) {
			String paraName = (String) paraNames.nextElement();
			String value = getInitParameter(paraName);
			out.println("<tr><td>"+paraName+"</td><td>"+value+"</td></tr>");
		}
		out.println("</table>");
		
		out.close();
	}

}
