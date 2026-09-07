package CIET;
import java.util.List;
import java.util.ArrayList;

public class CollectionFramework2 {
	public static void main(String[] args) {
		List<Object> mixedList=new ArrayList<>();
		mixedList.add("chandan");
		mixedList.add(571603);
		mixedList.add(4259);
		mixedList.add("rohit");
		System.out.println(mixedList);
		for(Object item:mixedList) {
			if(item instanceof String) {
				String str=(String)item;
				System.out.println(str);
			}
			else if(item instanceof Integer) {
				int n=(Integer)item;
				System.out.println(n);
			}
		}
	}

}
