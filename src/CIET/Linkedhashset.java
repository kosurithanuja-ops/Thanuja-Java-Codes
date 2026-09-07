package CIET;
import java.util.*;

public class Linkedhashset {
	public static void main(String[] args) {
		LinkedHashSet<String> set=new LinkedHashSet<>();
		set.add("dog");
		set.add("cat");
		set.add("rat");
		set.add("cat");
		
		System.out.println(set);
		ArrayList<String> a=new ArrayList<>(set);
		System.out.println(a.get(0));
		System.out.println(a.indexOf("cat"));
		

	}

}
