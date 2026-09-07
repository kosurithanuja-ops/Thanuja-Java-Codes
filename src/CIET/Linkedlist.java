package CIET;
import java.util.*;
import java.util.ArrayList;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList<String> lt=new LinkedList<>();
		lt.add("ram");
		lt.add("rohit");
		lt.add("suppi");
		lt.add("archana");
		lt.add("pavvi");
		System.out.println(lt);
		lt.addFirst("rohit");
		lt.addLast("shiva");
		System.out.println(lt);
		lt.removeFirst();
		lt.removeLast();
		System.out.println(lt);

	}

}
