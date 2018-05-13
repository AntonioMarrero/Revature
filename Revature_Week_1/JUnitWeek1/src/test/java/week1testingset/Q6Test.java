package week1testingset;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.corejavaassignment.Q6IsEven;

public class Q6Test {

	@Test
	public void test() {
		assertEquals(true, Q6IsEven.checkEven(6));
	}
	
	@Test
	public void test2() {
		assertEquals(false, Q6IsEven.checkEven(7));
	}
	
	

}
