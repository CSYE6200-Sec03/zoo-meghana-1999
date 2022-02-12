package edu.neu.spring22.csye6200;

public class ZooAnimals {
	public static void demo() {
		AnimalAPI a=new AnimalAPI();
		AnimalAPI l1=new Lion();
		AnimalAPI t1=new Tiger();
		AnimalAPI h1=new Hyena();
		a.speak();
        l1.speak();
        t1.speak();
        h1.speak();
	}
	public ZooAnimals() {
		super();//default constructor
	}

	@Override
	public String toString() {
		return "ZooAnimals";
	}
	

	}

