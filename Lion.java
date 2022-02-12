package edu.neu.spring22.csye6200;

public class Lion extends AnimalAPI {
	@Override
	public void speak() {
		System.out.println("Lion Roars!");
	}
	public Lion() {
		super();//default constructor
	}

	@Override
	public String toString() {
		return "Lion";
	}
	

}
