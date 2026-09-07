package CIET;

import java.util.ArrayList;

public class AbcList {

	public void add(String string) {
		AbcList user = new ArrayList<>();
		for(int i = 0; i <= 100; i++) {
	    user.add("users" + i);
		}
		int page = 3; 
		int pageSize = 10;
		int start = (page-1) * pageSize;
		int end = Math.min(start + pageSize, user.size());
		List result = user.subList(start, end);
		System.out.println(result);
	}
		// TODO Auto-generated method stub
		
	}

}
