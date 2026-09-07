
package CIET;
interface Plants{
	void eat();
	
}
interface Dog1{
	void barks();
}
class Tiger implements Plants, Dog1 {
	public void eat() {
		System.out.println("plant eats");
		
	}
	public void  barks() {
		System.out.println("Dog1 barks");
	}
	
}

public class MultipleInheritence {
	public static void main(String[] args) {
		Tiger t=new Tiger();
		t.eat();
		t.barks();
	}
}
