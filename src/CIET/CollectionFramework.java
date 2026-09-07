package CIET;
import java.util.*;

public class CollectionFramework {
	public static void main(String[] args) {
	    Collection<String>	names = new ArrayList<>();
	    names.add("chandan");
	    names.add("rahul");
	    names.add("naga");
	    names.add("rohit");
	    System.out.println(names);
	    System.out.println(names.size());
	    System.out.println(names.contains("rohit"));
	    names.remove("chandan");
	    System.out.println(names);
	    System.out.println(names.isEmpty());
	    names.clear();
	    System.out.println(names);
	        
	}

}
