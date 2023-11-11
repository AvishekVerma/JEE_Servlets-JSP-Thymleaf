package com.avishek;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

//@WebServlet("/test")
public class FirstServlet implements Servlet {

	static {
		System.out.println("FirstServlet.class file is loading....");
	}
	
	public FirstServlet() {
		System.out.println("FirstServlet Object is instantiated....");
	}

	// For Servlet Initialization container calls this method.
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet initialization.....");
	}

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}

	// Request Processing logic
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("Servlet Request Processing...");
		
		PrintWriter out = res.getWriter();
		out.println("<h1><center>FirstServlet....</center></h1>");
	}

	@Override
	public String getServletInfo() {
		return null;
	}
	
	// Servlet DeInstantion logic
	@Override
	public void destroy() {
		System.out.println("Servlet De-Instantiation...");
	}
}
