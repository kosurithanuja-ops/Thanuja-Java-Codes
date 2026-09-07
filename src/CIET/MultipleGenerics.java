package CIET;
import java.util.concurrent.ConcurrentHashMap;

class Demo1<T,V>{
	private T key;
	private V value;
	Demo1(T key, V value){
		this.key=key;
		this.value=value;
	}
	public T getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}
public class MultipleGenerics {
	public static void main(String[] args) {
		Demo1<Integer,String> student = new Demo1<>(100,"Thanuja");
		Demo1<Integer,String> student1 = new Demo1<>(102,"Ganavi");
		Demo1<Integer,String> student2 = new Demo1<>(103,"Naga");
		System.out.println(student.getKey());
		System.out.println(student.getValue());
		System.out.println(student1.getValue());
		System.out.println(student1.getKey());		
	}

}
