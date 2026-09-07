package CIET;
interface Animals{
	void sounds();
	default void stop() {
	System.out.println("animals stops when human comes in front of it");
	}
}
class Dogs implements Animals{
	public void sounds() {
		System.out.println("dog barks");
	}
}
public class DefaultInterface1 {
	public static void main(String[] args) {
		Dogs d = new Dogs();
		d.sounds();
		d.stop();
	}

}