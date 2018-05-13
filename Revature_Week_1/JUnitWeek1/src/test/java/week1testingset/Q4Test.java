package week1testingset;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.corejavaassignment.Q4Factorial;

public class Q4Test {

	@Test
	public void test() {
		
		int fact = Q4Factorial.getFactorial(4);
		assertEquals(96, fact);
	}

}
