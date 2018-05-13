package week1testingset;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.corejavaassignment.Q16StringLength;

public class Q16Test {

	@Test
	public void test() {
		
		assertEquals(5, Q16StringLength.stringLeng("larry"));
		
	}

}
