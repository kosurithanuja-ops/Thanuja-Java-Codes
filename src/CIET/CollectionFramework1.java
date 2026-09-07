package CIET;

public class CollectionFramework1 {
	public static void main(String[] args) {
		Houses<Integer> names = new ArraysList<>();
		names.add(10);
		names.add(20);
		System.out.println(names);
		System.out.println(names.get(0));
		names.set(1, 90);
		System.out.println(names);
		names.remove(0);
		System.out.println(names);
			
	}


}



