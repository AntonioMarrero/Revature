package com.revature.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;

import com.revature.beans.*;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		Bear b1 = (BearWithSetter) ac.getBean("bearWithSetter");
		b1.methodInBear();
		
		
		Bear b2 = (BearWithConstructor) ac.getBean("bearWithConstructor");
		b2.methodInBear();
		
		
		Bear b3 = (BearWithAutowiringByName) ac.getBean("bearWithAutowiringByName");
		b3.methodInBear();
		
		
		Bear b4 = (BearWithAutowiringByType) ac.getBean("bearWithAutowiringByType");
		b4.methodInBear();
		
		
		BearWithAutomagic b5 = (BearWithAutomagic) ac.getBean("bearWithAutomagic");
		b5.methodInBear();
		
		((AbstractApplicationContext) ac).close();

	}

}
