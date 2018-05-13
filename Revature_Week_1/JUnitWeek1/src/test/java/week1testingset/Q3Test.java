package week1testingset;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.corejavaassignment.Q3ReverseString;

public class Q3Test {

	@Test
	public void test() {
		String str1 = Q3ReverseString.getReverseString("reverse");
		assertEquals("esrever", str1);
		
	}

}
