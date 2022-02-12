package edu.neu.spring22.csye6200;

public class HyenaA extends AbstractAnimalAPI {
	@Override
	public void speak(){
		System.out.println("Hyena Laughs!!");
	}

	public HyenaA() {
		super();//default constructor
	}

	@Override
	public String toString() {
		return "HyenaA";
	}

}
