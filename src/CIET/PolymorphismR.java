package CIET;

class Animal{
	void sound() {
		System.out.println("animal makes sound");
	}
}
class Dog extends Animal{
	@Override
	void sound() {
		System.out.println("dog barks");
	}
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("cat meows");
	}
}

public class PolymorphismR {
	public static void main(String[] args) {
		Animal d = new Dog();
		Animal c = new Cat();
		d.sound();
		c.sound();
	}

}
