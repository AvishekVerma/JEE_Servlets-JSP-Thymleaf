package com.avishek;

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
public class ResponseInfoApp extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FileInputStream fis;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("image/jpg");
		
		File file = new File("D:\\Coding\\Java\\JEE_Servlet_JSP\\S09-ResponseInfoApp\\IMG20230612122714.jpg");
		FileInputStream fis = new FileInputStream(file);
		
		byte[] b = new byte[(int) file.length()];
		fis.read(b);
		
		ServletOutputStream stream = response.getOutputStream();
		stream.write(b);
		
		stream.flush();
		stream.close();
		
		fis.close();
	
	}

}
