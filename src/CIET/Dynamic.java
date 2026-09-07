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
	void play() {
		System.out.println("play");
	}
}
class Cat extends Animal{
	@Override
	void sound() {
		System.out.println("cat meows");
	}
}

public class Dynamic {
	public static void main(String[] args) {
		Animal d = new Dog();
		Animal c = new Cat();
		d.sound();
		c.sound();
	}

}
