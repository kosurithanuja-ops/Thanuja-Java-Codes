package CIET;
class parents{
	void display() {
		System.out.println("inside parent");
	}
}
class Childs extends parents {
	@Override
	void display() {
		System.out.println("inside child class");
		super.display();
		
	}
}

public class super1 {
	public static void main(String[] args) {
		Childs c=new Childs();
		c.display();
	}

}
