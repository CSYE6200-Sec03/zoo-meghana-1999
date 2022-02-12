package edu.neu.spring22.csye6200;

public class Hyena extends AnimalAPI{
	@Override
	public void speak() {
		System.out.println("Hyena Laughs!");
	}

	public Hyena() {
		super();//default constructor
	}

	@Override
	public String toString() {
		return "Hyena []";
	}
	 

}
