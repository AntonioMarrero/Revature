package com.revature.main;

public class Bicycle {
//classes and interfaces should be PascalCased
//packages should be all lowercase
	
	//define a few fields
	//fields should be camelCased and nouns
	public int speed = 0;
	public int gear = 1;
	public static String bikeShop = "RevaBikes";
	
	//constants are in all caps
	public static final int MAX_SPEED = 25;
	
	//define methods to manipulate the fields
	//method should also be camel cased, should be verbs
	public void speedUp(int increment) {
		if(this.speed+increment>MAX_SPEED) {
			System.out.println("You're going too fast!");
			return;
		} else {
			this.speed = this.speed + increment;
			//this.speed += increment;
		}
	}
	
	public void applyBrakes(int decrement) {
		if(this.speed-decrement<0) {
			try {
				throw new NegativeSpeedException();
			} catch (NegativeSpeedException e) {
				e.printStackTrace();
			}
			return;
		} else {
			this.speed = this.speed - decrement;
			//this.speed -= decrement;
		}
	}

	public void changeGear(int gear) {
		this.gear = gear;
	}
	
	public void printStatus() {
		System.out.println("Speed: "+this.speed+", Gear: "+this.gear);
	}

	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Bicycle)) {
			return false;
		}
		
		Bicycle b = (Bicycle) o;
		
		if(this.gear == b.gear && this.speed == b.speed) {
			return true;
		}
		
		return false;
		
	}
	

}
