package week1testingset;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.revature.corejavaassignment.Q9PrimeNumbers;

public class Q9Test {

	@Test
	public void test() {
		int counter = 0;
		ArrayList<Integer> ar = Q9PrimeNumbers.myPrimeNumbers();
		for(int i: ar) {
			counter++;
		}
		assertEquals(25, counter);
	}

}
