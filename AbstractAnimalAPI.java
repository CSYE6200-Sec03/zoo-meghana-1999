package edu.neu.spring22.csye6200;

public abstract class AbstractAnimalAPI {
public abstract void speak();
public AbstractAnimalAPI() {
	super();//default constructor
}

@Override
public String toString() {
	return "AbstractAnimalAPI";
}
}
