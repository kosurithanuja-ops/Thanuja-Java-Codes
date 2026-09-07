package CIET;
interface Forest{
	void sound();
}
class Cow implements Forest{
	public void sound() {
		System.out.println("cow barks");
	}
}

public class Interface {
	public static void main(String[] args) {
		Cow d =new Cow();
		d.sound();
	}

}
