package edu.neu.spring22.csye6200;

public class LionA extends AbstractAnimalAPI {
	@Override
	public void speak(){
		System.out.println("Lion Roars!!");
	}
	public LionA() {
		super();//default constructor
	}

	@Override
	public String toString() {
		return "LionA";
	}
	

}
