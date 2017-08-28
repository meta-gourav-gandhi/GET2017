/**
 * 
 */
package test.java.com.metacube.unittest;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;

import main.java.com.metacube.concordance.ConcordanceImp;

import org.junit.Test;

/**
 * @author gourav gandhi
 *
 */
public class ConcordanceImpTest {

	
	@Test
	public void testGetConcordanceMap() {
		HashMap<Character,List<Integer>> actual = ConcordanceImp.getConcordanceMap();
		HashMap<Character,List<Integer>> expected = new HashMap<Character, List<Integer>>();
		assertEquals(expected.toString(), actual.toString());
	}
	
	@Test
	public void testConcordanceA(){
		ConcordanceImp.getConcordance("Hello World");
		HashMap<Character,List<Integer>> actual = ConcordanceImp.getConcordanceMap();
		String expected = "{r=[7], d=[9], e=[1], W=[5], H=[0], l=[2, 3, 8], o=[4, 6]}";
		assertEquals(expected, actual.toString());
		actual.clear();
		
	}
	
	@Test
	public void testConcordanceB(){
		ConcordanceImp.getConcordance("Gourav gandhi");
		HashMap<Character,List<Integer>> actual = ConcordanceImp.getConcordanceMap();
		String expected = "{a=[4, 7], r=[3], d=[9], u=[2], v=[5], G=[0], g=[6], h=[10], i=[11], n=[8], o=[1]}";
		assertEquals(expected, actual.toString());
		actual.clear();
		
	}
	
	@Test
	public void testConcordanceC(){
		ConcordanceImp.getConcordance("Metacube");
		HashMap<Character,List<Integer>> actual = ConcordanceImp.getConcordanceMap();
		String expected = "{a=[3], b=[6], c=[4], t=[2], e=[1, 7], u=[5], M=[0]}";
		assertEquals(expected, actual.toString());
		actual.clear();
		
	}
	@Test
	public void testConcordanceD(){
		ConcordanceImp.getConcordance("Bye world");
		HashMap<Character,List<Integer>> actual = ConcordanceImp.getConcordanceMap();
		String expected = "{B=[0], r=[5], d=[7], e=[2], w=[3], y=[1], l=[6], o=[4]}";
		assertEquals(expected, actual.toString());
		actual.clear();
		
	}

}
