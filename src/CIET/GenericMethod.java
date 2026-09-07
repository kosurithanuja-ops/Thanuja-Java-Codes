package CIET;
import java.util.concurrent.ConcurrentHashMap;

class Demo{
	public static <T> void printArray(T[] arr) {
		for(T value:arr) {
			System.out.println(value);
		}
	}
}

public class GenericMethod {
	public static void main(String[] args) {
		String[] names = {"chandan","mahadev","sunanda"};
		Demo.printArray(names);
	}

}
