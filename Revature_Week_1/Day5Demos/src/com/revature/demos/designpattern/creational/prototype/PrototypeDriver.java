package com.revature.demos.designpattern.creational.prototype;

/*
 * Prototype pattern allows making new instances by copying the existing 
 * instances. Prototype pattern results in a cloned object which is 
 * different from the original object. The state of the original is the 
 * same as the clone, at the time of cloning. Thereafter each object may 
 * undergo state change. We can modify the objects to perform different 
 * things as well. The only good thing is client can make new instances 
 * without knowing which specific class is being instantiated.
 */
public class PrototypeDriver {
	
	public static void main(String[] args) {
		
		Students stu1 = new Students();
		stu1.loadData();
		
		Students stu2;
		
		try {
			stu2 = (Students) stu1.clone();
		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
			stu2 = new Students();
		}
		
		for(int i = 0; i < stu1.getStudentList().size(); i++) {
			System.out.println("stu1, student: " + stu1.getStudentList().get(i));
			System.out.println("stu2, student: " + stu2.getStudentList().get(i) + "\n");
		}
		
		System.out.println("stu1 == stu2? " + (stu1 == stu2));
		System.out.println("stu1.equals(stu2)? " + stu1.equals(stu2));
	}

}

/*
 * Benefits
 * 		- Hides complexities of creating of objects.
 * 		- The clients can get new objects without knowing whose type it will be.
 * 		- Reduce subclassing.
 * 
 * Drawbacks
 * 		- Drawback to using the Prototype is that making a copy of an object can sometimes be complicated.
 * 		- Classes that have circular references to other classes cannot really be cloned.
 * 
 * When to use this pattern
 * 		- If the cost of creating the object is expensive or complicated.
 * 		- When trying to keep the number of classes in an application to a minimum
 * 		- When adding or removing objects at runtime
 * 		- When the client application needs to be unaware of the object creation, composition and representation.
 * 		- Objects are required which are similar to the existing objects
 */
