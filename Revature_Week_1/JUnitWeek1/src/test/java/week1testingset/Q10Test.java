package week1testingset;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.corejavaassignment.Q10Ternary;

public class Q10Test {

	@Test
	public void test() { 
		assertEquals(4, Q10Ternary.calculateMinNumbers(4, 8));
	}

}
