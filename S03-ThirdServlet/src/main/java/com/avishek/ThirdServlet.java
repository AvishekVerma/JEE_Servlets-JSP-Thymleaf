package com.avishek;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns="/test", loadOnStartup=10)
public class ThirdServlet implements Servlet {

	static {
		System.out.println("ThirdServlet.class file is loading....");
	}

	public ThirdServlet() {
		System.out.println("ThirdServlet Object is instantiated...");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Servlet initialization....");
	}
	
	@Override
	public ServletConfig getServletConfig() {
		return null;
	}


	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		res.setContentType("text/html");
		
		System.out.println("Servlet Request Processing....");
		
		PrintWriter out = res.getWriter();
		
		out.println("<html><head><title>Avi_ServletApp</title></head>");
		out.println("<body>");
		out.println("<h1><marquee>Welcome to Advance Java....</marquee></h1>");
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}
     
	@Override
	public String getServletInfo() {
		return null;
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet de-initialization....");
	}
   

}
