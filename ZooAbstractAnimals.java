package edu.neu.spring22.csye6200;

public class ZooAbstractAnimals {
	public static void demo() {
		AbstractAnimalAPI l2=new LionA();
		AbstractAnimalAPI t2=new TigerA();
		AbstractAnimalAPI h2=new HyenaA();
l2.speak();
t2.speak();
h2.speak();
	}

	public ZooAbstractAnimals() {
		super();//default constructor
	}

	@Override
	public String toString() {
		return "ZooAbstractAnimals";
	}

}



