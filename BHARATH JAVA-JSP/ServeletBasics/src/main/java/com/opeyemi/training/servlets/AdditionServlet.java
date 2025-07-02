package com.opeyemi.training.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

//@WebServlet(name = "Addition",urlPatterns = "numbers.html")
public class AdditionServlet extends GenericServlet {
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		if(request.getParameter("number1")!= null && request.getParameter("number2")!= null) {
			Long num1 = Long.parseLong(request.getParameter("number1"));
			Long num2 = Long.parseLong(request.getParameter("number2"));
			
			PrintWriter result = response.getWriter();
			result.println("The Result is " + (num1 + num2));
		}
		
	}
}
