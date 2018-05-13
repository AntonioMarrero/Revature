package week1testingset;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.revature.corejavaassignment.Q12ForEnhanced;

public class Q12Test {

	@Test
	public void test() {
		ArrayList<Integer> ar = Q12ForEnhanced.getMyEvenNumbers();
		int counter = 0;
		for(int i : ar) {
			counter++;
		}
		assertEquals(49, counter);
	}

}
