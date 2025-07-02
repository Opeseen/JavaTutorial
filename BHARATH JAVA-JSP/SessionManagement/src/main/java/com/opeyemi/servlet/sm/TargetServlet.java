package com.opeyemi.servlet.sm;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class TargetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)throws IOException{
		Cookie[] cookies = request.getCookies();
		for(int i = 0; i < cookies.length; i++ ) {
			System.out.println(cookies[i].getName());
			System.out.println(cookies[i].getValue());
		}
		HttpSession session = request.getSession();
		String user = (String) session.getAttribute("name");
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		writer.println("<h4>Username is: " + user +  "</h4>");
	}
}
