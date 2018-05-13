package week1testingset;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

import com.revature.corejavaassignment.Age;
import com.revature.corejavaassignment.Department;
import com.revature.corejavaassignment.Employee;
import com.revature.corejavaassignment.Name;

public class Q7Test {

	@Test
	public void test() {
		
		Employee a = new Employee("Maria", "Sales", 30);
		Employee b = new Employee("Jose", "QC", 25);
		
		assertNotNull(b);
		
		
		
	}

}
