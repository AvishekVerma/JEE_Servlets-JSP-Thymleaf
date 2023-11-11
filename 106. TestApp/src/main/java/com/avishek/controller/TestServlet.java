package com.avishek.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		System.out.println("Implementation classes of tomcat server :: \n\n");
		ServletConfig config = getServletConfig();
		ServletContext context = getServletContext();
		System.out.println("Implementation class of config object is :: "+ config.getClass().getName());
		System.out.println("Implementation class of context object is :: "+ context.getClass().getName());
		System.out.println("Implementation class of request object is :: "+ request.getClass().getName());
		System.out.println("Implementation class of response object is :: "+ response.getClass().getName());
	}

}
