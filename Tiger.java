package edu.neu.spring22.csye6200;

public class Tiger extends AnimalAPI{
	@Override
	public void speak(){
		System.out.println("Tiger growls!");

	}
	public Tiger() {
		super();//default constructor
	}

	@Override
	public String toString() {
		return "Tiger";
	}
	

}
