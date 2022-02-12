package edu.neu.spring22.csye6200;

public class HyenaI implements AnimilisticAPI{
	@Override
	public void speak() {
		System.out.println("Hyena Laughs!!!");
	}

	/**
	 * 
	 */
	public HyenaI() {
		super();//default constructor
	}

	@Override
	public String toString() {
		return "HyenaI []";
	}
	

}