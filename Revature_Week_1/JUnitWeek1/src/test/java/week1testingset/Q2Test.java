package week1testingset;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.corejavaassignment.Q2Fibonacci;

import junit.framework.Assert;

public class Q2Test {

	@Test
	public void test() {
//		int limit = 25;
//		int num1 = 0;
//		int num2 = 1;
//		int num = 0;
//		for(int i = 2; i < limit; ++i) {
//	
//			num = num2 + num1;
//			num1 = num2;
//			num2 =  num;
//			System.out.println(num + " ");
//		}
		
		int num = Q2Fibonacci.getFibonacciNumbers(25, 0, 1);
		assertEquals(46368, num);
		
	}
}