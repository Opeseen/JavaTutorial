package com.opeyemi.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateUserServlet
 */
@WebServlet("/updateServlet")
public class UpdateuserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;
	
	public void init() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/student","Horpeyemi","yomex5055");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		try {
			Statement statement = connection.createStatement();
			int result = statement.executeUpdate("update user set password = '"+password+"' where email ='"+email+"'");
			PrintWriter out = response.getWriter();
			if (result > 0)out.print("<h1>PASSWORD UPDATED</h1>");
			else out.print("<h1>ERROR UPDATING THE USER</h1>");	
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
