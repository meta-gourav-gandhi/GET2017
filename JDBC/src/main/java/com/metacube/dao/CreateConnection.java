package com.metacube.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.metacube.constants.Constants;

public class CreateConnection {
	static Connection connection ;
	
	private CreateConnection(){}
	
	/**
	 * @return the conection class object
	 * @throws SQLException
	 */
	public static synchronized	Connection getConnection() throws SQLException{
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch(ClassNotFoundException exp){
			System.out.println("error loading in drivers : " + exp);
		}
		
		if(connection==null)
		{
			connection = DriverManager.getConnection(Constants.mySQLURL,Constants.userId,Constants.password); 	
		}
		return connection;
		
	}

	/**
	 * function to close the connection
	 */
	public static void closeConnection() {
		
		try {
			connection.close();
		} catch (SQLException e) {
			System.out.println("Problem in closing the connection" + e);
		}
		
	}
	
}
