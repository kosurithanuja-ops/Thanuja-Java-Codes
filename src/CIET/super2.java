package CIET;
class parentt{
	parentt() {
		System.out.println("inside constructor");
	}
	void son() {
		System.out.println("inside son");
	}
}
class Childd extends parents {
	
	Childd() {
		super();
		System.out.println("inside child class");
		
	}
}

public class super2 {
	public static void main(String[] args) {
		Childs c=new Childs();

	}

}
