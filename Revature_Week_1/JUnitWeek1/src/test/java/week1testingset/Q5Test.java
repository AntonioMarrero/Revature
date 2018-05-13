package week1testingset;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.corejavaassignment.Q5Substring;

public class Q5Test {

	@Test
	public void test() {
		assertEquals(Q5Substring.substringIndex("something", 3), "som");
	}

}
