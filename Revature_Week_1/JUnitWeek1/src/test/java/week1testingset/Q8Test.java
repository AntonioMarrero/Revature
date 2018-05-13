package week1testingset;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import com.revature.corejavaassignment.Q8ArrayList;

public class Q8Test {

	@Test
	public void test() {
		String[] list1 = {"madam", "civic", "radar",
				"kayak", "refer", "did"};
		
		String[] list2 = {"karan", "madam", "tom", "civic", "radar", "jimmy",
				"kayak", "john", "refer", "billy", "did"};
		int i = 0;
		ArrayList<String> arr = Q8ArrayList.Palindromes(list2);
		
		for(String j : arr);
		i++;
		
	}

}
