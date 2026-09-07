package CIET;
import java.util.*;


public class Hashset {
	public static void main(String[] args) {
		HashSet<String> lg=new HashSet<>();
		lg.add("cat");
		lg.add("dog");
		lg.add("rat");
		System.out.println(lg);
		System.out.println(lg.contains("dog"));
		lg.remove("cat");
		System.out.println(lg);
		
				
		
	}

}
