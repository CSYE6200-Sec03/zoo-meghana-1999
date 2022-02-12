package edu.neu.spring22.csye6200;

public class TigerI implements AnimilisticAPI{
	@Override
	public void speak() {
		System.out.println("Tiger Growls!!!");
	}

	public TigerI() {
		super();//default constructor
	}

	@Override
	public String toString() {
		return "TigerI";
	}
	

}