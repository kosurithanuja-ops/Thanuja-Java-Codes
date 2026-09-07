package CIET;
import java.util.Scanner;

class Animal{
	void eat(){
		System.out.println("Animal is eating");
	}
}
class Dog extends Animal{
	 void bark(){
		System.out.println("Dog barks");
	}
}
class Cat extends Dog {
	void meow() {
		System.out.println("Cat meows");
	}
}
class Rat extends Cat{
	void hide() {
		System.out.println("Rat hides");
	}
	
}

public class multilevelinheritence {
	public static void main(String[] args) {
		Rat r=new Rat();
		r.eat();
		r.bark();
		r.meow();
		r.hide();
		
		
		
	}

}
