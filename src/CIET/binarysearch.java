package CIET;
import java.util.Arrays;

public class binarysearch {
	public static void main(String[] args) {
		int numbers[] = {10,20,30,40,50};
		int target=30;
		int index=Arrays.binarySearch(numbers,target);
		System.out.println(index);
	}

}
