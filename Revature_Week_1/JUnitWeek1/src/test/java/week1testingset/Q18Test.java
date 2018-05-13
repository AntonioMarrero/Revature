package week1testingset;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.corejavaassignment.Q18Convertion;

public class Q18Test {

	@Test
	public void test() {
		Q18Convertion test = new Q18Convertion();
		
		assertEquals(true, test.upperCase("tomY"));
	}
	
	@Test
	public void test2() {
		Q18Convertion test = new Q18Convertion();
		assertEquals("TOM", test.lowerUpper("tom"));
	}
	
	@Test
	public void test3() {
		Q18Convertion test = new Q18Convertion();
		assertEquals(false, test.stringToInt("pope"));
	}

}
