package io.github.Moemoe03.javaRegax;

public class Car {

	private Engine engine;

	public Car(Engine engine) {
		this.engine = engine;
	}

	public void startEngine() {
		this.engine.start();
	}
}
