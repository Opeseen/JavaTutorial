package com.opeyemi.intersrevletcomm.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
	Statement statement;

	public void init(ServletConfig config) {
		try {
			ServletContext context = config.getServletContext();
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("dbUrl"),
					context.getInitParameter("dbUser"), context.getInitParameter("dbPasswd"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String user = request.getParameter("userName");
		String password = request.getParameter("password");
		try {
			statement = connection.createStatement();
			ResultSet result = statement
					.executeQuery("select * from user where email='" + user + "' and password='" + password + "'");
			RequestDispatcher dispatcher = request.getRequestDispatcher("homeServlet");
			if (result.next()) {
				request.setAttribute("Message", "Welcome to inter servlet communication " + user);
				dispatcher.forward(request, response);
			} else {
				dispatcher = request.getRequestDispatcher("login.html");
				dispatcher.forward(request, response);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
