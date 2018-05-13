package week1testingset;

import static org.junit.Assert.*;

import org.junit.Test;

import com.revature.corejavaassignment.Q1BubbleSortNumbers;

public class Q1Test {

	@Test
	public void test() {
		int[] sorted = {1,2,3,4,5};
		int[] scramble = {2,4,1,5,3};
		 Q1BubbleSortNumbers.bubbleSort(scramble);
		 
		assertArrayEquals(sorted,scramble);
	}

}
