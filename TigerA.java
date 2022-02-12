package edu.neu.spring22.csye6200;

public class TigerA extends AbstractAnimalAPI {
	@Override
	public void speak(){
		System.out.println("Tiger Growls!!");
	}

	public TigerA() {
		super();//default constructor
	
	}

	@Override
	public String toString() {
		return "TigerA";
	}
	

}
