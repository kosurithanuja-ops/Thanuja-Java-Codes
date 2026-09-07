package CIET;
class Bird {
	Bird(){
		System.out.println("Bird stay in forest");
	}
	Bird(int a){
		System.out.println("A value"+ a);
	}
}

public class constructoroverloading {
	public static void main(String[] args) {
		new Bird();
		new Bird(10);
	}

}
