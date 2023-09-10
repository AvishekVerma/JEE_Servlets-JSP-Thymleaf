package com.avishek.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("image/jpg");
		
		File file = new File("D:\\Coding\\Java\\JEE_Servlets_JSP_Thymleaf\\ResponseInfoApp\\6308a46af5fba729329c178b.jpg");
		FileInputStream fis = new FileInputStream(file);
		
		byte[] b = new byte[(int) file.length()];
		fis.read(); // reading into byte[] through inputStream
		
		ServletOutputStream stream = response.getOutputStream();
		stream.write(b); // writing from [] to response
		
		stream.flush();
		stream.close();
		fis.close();
	}

}
