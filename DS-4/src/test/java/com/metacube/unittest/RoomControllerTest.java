package test.java.com.metacube.unittest;

import static org.junit.Assert.*;

import java.util.HashMap;

import main.java.com.metacube.assignment2.Guest;
import main.java.com.metacube.assignment2.RoomController;

import org.junit.Test;

public class RoomControllerTest {

	@Test
	public void testGetRoomNum() {
		int actual=RoomController.getRoomNum();
		int expected=41;
		assertEquals(expected, actual);
	}

	@Test
	public void testGetmap() {
		HashMap<Integer,Guest> actual= RoomController.getmap();
		HashMap<Integer,Guest> expected= new HashMap<Integer, Guest>();
		assertSame(expected.toString(), actual.toString());
	}

}
