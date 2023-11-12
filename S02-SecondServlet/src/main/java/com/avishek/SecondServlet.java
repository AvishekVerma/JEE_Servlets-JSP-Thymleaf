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
public class SecondServlet implements Servlet {
	
	static {
		System.out.println("SecondServlet.class file is loading....");
	}

	public SecondServlet() {
		System.out.println("SecondServlet Object is instantiated...");
	}
	
	// For Servlet Initialization container calls this method
	public void init(ServletConfig config) throws ServletException{
		System.out.println("Servlet initialization....");
	}
	
	public ServletConfig getServletConfig() {
		return null;
	}
	
	// Request Processing logic
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		
		System.out.println("Servlet Request Processing...");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>Avi_ServletApp</title></head>");
		out.println("<body>");
		out.println("<h1><marquee>Welcome to Advance Java....</marquee></h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
	
	public String getServletInfo() {
		return null;
	}
	
	public void destroy() {
		System.out.println("Servlet De-Instantiation....");
	}


}
