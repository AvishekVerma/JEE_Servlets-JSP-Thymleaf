package com.avishek.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DBController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Connection connection = null;
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver loaded successfully...");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void init() throws ServletException{
		
		System.out.println("Config object created and got the values from config object...\n\n");
		
		String url = getInitParameter("url");
		String username = getInitParameter("username");
		String password = getInitParameter("password");
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		try {
			connection = DriverManager.getConnection(url, username, password);
			if(connection != null) {
				System.out.println("Connection established successfully....");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		out.println("<h1>Request type is :: "+request.getMethod()+"</h1>");
		
		Statement statement = null;
		ResultSet resultSet = null;
		
		try {
			statement = connection.createStatement();
			if(statement != null) {
				String sqlSelectQuery = "select sid, sname, sage, saddress from student";
				resultSet = statement.executeQuery(sqlSelectQuery);
			}
			out.println("<table border='1'>");
			out.println("<th><td>Id</td><td>Name</td><td>Age</td><td>Address</td></th>");
			if(resultSet != null) {
				while(resultSet.next()) {
					int sid = resultSet.getInt(1);
					String sname = resultSet.getString(2);
					int sage = resultSet.getInt(3);
					String saddress = resultSet.getString(4);
					out.println("<tr><td></td><td>"+sid+"</td><td>"+sname+"</td><td>"+sage+"</td><td>"+saddress+"</td></tr>");
				}
			}
			out.println("</table>");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
