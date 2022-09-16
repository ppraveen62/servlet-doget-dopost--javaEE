package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class myservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public myservlet() {
        super();
     
    }

	/*
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=response.getWriter();
		writer.println("<h1>this is service method</h1>");
	}
*/
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer=response.getWriter();
		String name =request.getParameter("fname");
		writer.println("<br>hi "+ name);
		writer.println("this is get method");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter writer=response.getWriter();
		String name =request.getParameter("fname");
		writer.println("hi "+ name);
		writer.println("this is post method");
	}

}
