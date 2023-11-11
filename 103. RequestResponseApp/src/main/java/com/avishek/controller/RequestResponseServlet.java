package com.avishek.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class RequestResponseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		LocalDateTime date = LocalDateTime.now();
		int hour = date.getHour();
		String msg = "";
		if(hour < 12) {
			msg += "Good Morning";
		}else if(hour < 16) {
			msg += "Good Afternoon";
		}else if(hour < 20) {
			msg += "Good Evening";
		}else {
			msg += "Good Nighit";
		}
		out.println("<h1 style='color:Red; text-align:center;'>Welcome to Servlet Coding...</h1>");
		out.println("<h2 style='color:Blue; text-align:center;'>The Current Date and Time is :: "+date+" </h2>");
		out.println("<h3 style='color:Brown; text-align:center;'>Greeting from the Server :: "+msg+" </h3>");
		out.println("<br/>Sevlet Request object address is :: "+request.hashCode());
		out.println("<br/>Sevlet Response object address is :: "+response.hashCode());
		out.println("<br/>Current servlet object address is :: "+this.hashCode());
		out.println("<br/>Current Request-Thread object address is :: "+Thread.currentThread().hashCode());
	
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		out.close();
	}

}
