package week1testingset;

import static org.junit.Assert.assertEquals;

import org.junit.Assert.*;

import org.junit.Test;

import com.revature.corejavaassignment.Q17PrincipleInterest;

public class Q17Test {

	@Test
	public void test() {
		
		int interest = (int) Q17PrincipleInterest.intrest(6, 4, 2);
		int num = 48;
		
		assertEquals(48, interest);	
		
	}

}
