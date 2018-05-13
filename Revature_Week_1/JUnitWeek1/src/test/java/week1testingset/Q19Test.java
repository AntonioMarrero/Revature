package week1testingset;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class Q19Test {
	
	static ArrayList<Integer> arr = new ArrayList<Integer>();

	@Test
	public void test() {
		int add = 0;
		for(int i = 0; i<=10; i++) {
			if(i%2==0) {
				arr.add(i);
				add+=i;
			}
		}
		
		assertEquals(30, add);
	}
	
	@Test
	public void test2() {
		int add = 0;
		for(int i = 0; i<=10; i++) {
			if(i%2==0) {
				arr.add(i);
				add+=i;
			}
		}
		
		assertEquals(25, add);
	}
	
	@Test
	public void test3() {
		assertTrue(true);
	}

}
