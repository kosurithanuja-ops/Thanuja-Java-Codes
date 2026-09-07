package CIET;
import java.util.concurrent.ConcurrentHashMap;

public class TrafficRestAPI{
	private static final int MAX_REQUESTS=5;
	private static final long WINDOW = 60_000; //1 MINUT
	private final ConcurrentHashMap<Integer,UserRequest> requests=new ConcurrentHashMap
			public boolean allowRequest(int userId) {
		    long currentTime=System.currentTimeMillis();
		    UserRequest request=requests.computerIfAbest(
				userId,id->new UserRequest(currentTime,0));
		    synchro
		
	}
	
}
