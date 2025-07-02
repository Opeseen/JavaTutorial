package com.opeyemi.preparedstatement;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@WebServlet(name = "ProductServlet",urlPatterns = "/ProductServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;
	PreparedStatement statement;
	
	public void init(ServletConfig config) {
		try {
			ServletContext context = config.getServletContext();
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("dbUrl"),
					context.getInitParameter("dbUser"), context.getInitParameter("dbPasswd"));
			statement = connection.prepareStatement("insert into product values(?,?,?,?)");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		int price = Integer.parseInt(request.getParameter("price"));
		
		try {
			statement.setInt(1, id);
			statement.setString(2, name);
			statement.setString(3, description);
			statement.setInt(4, price);
			
			int result = statement.executeUpdate();
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print("<h4>" + result + " Product Created </h4>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void destroy() {
		try {
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
