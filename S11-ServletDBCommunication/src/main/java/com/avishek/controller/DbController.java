package com.avishek.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/db")
public class DbController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection connection = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded Successfully....");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public void init(ServletConfig config) throws ServletException {
	
		System.out.println("Config object created and got the values from config object...\n\n");
		
		String url = getInitParameter("url");
//		String username = getInitParameter("username");
//		String password = getInitParameter("password");
		System.out.println(url);
//		System.out.println(username);
//		System.out.println(password);
		
//		String url = getInitParameter("url");
//		String username = getInitParameter("username");
//		String password = getInitParameter("password");
//		
//		System.out.println("url :: "+url+"\nusername :: "+username+"\npassword"+password );
		
//		try {
//			connection = DriverManager.getConnection(url, username, password);
//			if(connection != null) {
//				System.out.println("Connection established successfully....");
//			}
//		}catch(SQLException e) {
//				e.printStackTrace();
//		}
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		out.println("<h1>Request type id :: "+ request.getMethod() + "</h1>");
		
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select id,name,age,address from student");
			while(resultSet.next()) {
				out.println("<p>"+resultSet.getInt(1)+"</p>");
				out.println("<p>"+resultSet.getString(2)+"</p>");
				out.println("<p>"+resultSet.getInt(3)+"</p>");
				out.println("<p>"+resultSet.getString(4)+"</p>");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
