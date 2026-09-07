package CIET;
class parent{
	private int x=10;
	public int get() {
		return x;
	}
	
}
class Child extends parent{
	void show() {
		System.out.println(get());
	}
}

public class privatenumbers {
	public static void main(String[] args) {
		Child c=new Child();
		c.show();
	}

}
