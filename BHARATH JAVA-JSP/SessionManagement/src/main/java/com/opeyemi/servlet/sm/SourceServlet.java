package com.opeyemi.servlet.sm;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SourceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		Cookie[] cookies = request.getCookies();
		if (cookies != null) {
			for (int i = 0; i < cookies.length; i++) {
				System.out.println(cookies[i].getName());
				System.out.println(cookies[i].getValue());
			}
		}
		response.addCookie(new Cookie("Token", "123456789abdef"));
		String user = request.getParameter("userName");
		HttpSession session = request.getSession();
		session.setAttribute("name", user);
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		String URL = "targetServlet?sessionID=123";
		writer.println("<a href='" + URL + "'>Click here to get the username</a>");
	}

}
