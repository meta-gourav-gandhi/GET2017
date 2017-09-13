package com.metacube.main;

import java.sql.SQLException;
import com.metacube.dao.CreateConnection;
import com.metacube.view.Display;

public class Main {

	public static void main(String[] args) throws SQLException {
		
		
		Display.displayMenu();
		CreateConnection.closeConnection();
		
	}
}
