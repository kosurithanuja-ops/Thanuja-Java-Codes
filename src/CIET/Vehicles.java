package CIET;
interface Vehicle{
	void start();
	void stop();
}
class Car implements Vehicle{
	@Override
	public void start() {
		System.out.println("car starts with a key");
	}

@Override 
public void stop() {
	System.out.println("car stops using brakes");
}
}
class Bike implements Vehicle {
	@Override
	public void start() {
		System.out.println("bike starts with self start");
	}
	@Override 
	public void stop() {
		System.out.println("bike stops");
	}
}
class Bus implements Vehicle{
	@Override
	public void start() {
		System.out.println("Bus starts");
	}
	@Override
	public void stop() {
		System.out.println("Bus stops");
	}
}
public class Vehicles {
	public static void main(String[] args) {
		Vehicle a;
		a = new Car();
		a.start();
		a.stop();
		a = new Bike();
		a.start();
		a.stop();
		a = new Bus();
		a.start();
		a.stop();
	}
    
}