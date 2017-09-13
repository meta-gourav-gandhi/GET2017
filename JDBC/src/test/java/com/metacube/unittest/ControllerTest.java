package com.metacube.unittest;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.metacube.controller.Controller;
import com.metacube.dao.CreateConnection;
import com.metacube.model.BookDetails;

public class ControllerTest {

	@Test
	public void test() throws SQLException {
		Connection connection = CreateConnection.getConnection();
		boolean actual=Controller.findBookByAuthor("gou");
		boolean expected=false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testIfBooksPresent() throws SQLException {
		Connection connection = CreateConnection.getConnection();
		boolean actual=Controller.findBookByAuthor("Jon");
		boolean expected=true;
		assertEquals(expected, actual);
		
	}
	
	
	@Test
	public void testofBookName() throws SQLException {
		Connection connection = CreateConnection.getConnection();
		boolean actual=Controller.findBookCanBeIssued("got");
		boolean expected=false;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testofBookNameFalse() throws SQLException {
		Connection connection = CreateConnection.getConnection();
		boolean actual=Controller.findBookCanBeIssued("Harry potter");
		boolean expected=true;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testofBookNameDeleted() throws SQLException {
		Connection connection = CreateConnection.getConnection();
		int actual=Controller.deleteBookNotIssusedForAyear();
		int expected=1;
		assertEquals(expected, actual);
	}

}
