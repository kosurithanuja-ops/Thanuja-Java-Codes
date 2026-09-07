package CIET;
import java.util.Scanner;

class Animal{
	void eat(){
		System.out.println("Animal is eating");
	}
	void sleep() {
		System.out.println("sleeping");
	}
}
class Dog extends Animal{
	 void bark(){
		System.out.println("Dog barks");
	}
	 void sleep() {
		 System.out.println("dog is sleeping");
	 }
}

public class methodoverriding {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();
		d.sleep();
		
	}

}