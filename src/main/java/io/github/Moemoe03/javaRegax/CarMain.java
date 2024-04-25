package io.github.Moemoe03.javaRegax;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    	PetrolEngine engine1 = new PetrolEngine();
	    	//GasEngine engine2 = new GasEngine();

	    	Car car = new Car(engine1);
	    	car.startEngine();
	    }
	}


