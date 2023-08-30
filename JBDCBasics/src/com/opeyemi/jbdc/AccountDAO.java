package com.opeyemi.jbdc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountDAO {
	public static void main(String[] args) {
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/student","admin","adminuser");
				Statement statement = connection.createStatement();
				ResultSet rs = statement.executeQuery("select * from account");	
				) {
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/student","Horpeyemi","yomex5055");
//			System.out.println(connection + " Is Now Available");
//			Statement statement = connection.createStatement();
//			int result = statement.executeUpdate("insert into account values(40,'Mike','Jordan',40000)");
//			int result = statement.executeUpdate("update account set balance = 10000 where lastname = 'opeyemi' ");
//			int result = statement.executeUpdate("delete from account where lastname = 'opeyemi' ");
//			System.out.println(result + " rows got inserted");
			
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
