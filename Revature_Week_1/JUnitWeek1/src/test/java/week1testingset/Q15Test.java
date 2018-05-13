package week1testingset;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.corejavaassignment.Q15Methods;

public class Q15Test {

	@Test
	public void test() {
		Q15Methods results = new Q15Methods();
				
		assertEquals(7, results.addition(4, 3));
	}
	
	@Test
	public void test2() {
		Q15Methods results = new Q15Methods();
				
		assertEquals(1, results.substraction(4, 3));
	}
	
	@Test
	public void test3() {
		Q15Methods results = new Q15Methods();
				
		assertEquals(12, results.multiplication(4, 3));
	}
	
	@Test
	public void test4() {
		Q15Methods results = new Q15Methods();
				
		assertEquals(3, results.division(12, 4));
	}

}
