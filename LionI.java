package edu.neu.spring22.csye6200;

public class LionI implements AnimilisticAPI{
	@Override
	public void speak() {
		System.out.println("Lion Roars!!!");
	}

	public LionI() {
		super();//default constructor
	}

	@Override
	public String toString() {
		return "LionI";
	}
	
	

}
