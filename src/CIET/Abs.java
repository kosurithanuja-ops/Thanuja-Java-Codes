package CIET;

abstract class Animal1{
	abstract void sound();
	void eat() {
		System.out.println("Animal eats");
		}
}
class Dog3 extends Animal1{
	void sound() {
		System.out.println("Dog bows");
	}
}


public class Abs {
	public static void main(String[] args) {
		Dog3 d=new Dog3();
		d.eat();
		d.sound();
	}

}
