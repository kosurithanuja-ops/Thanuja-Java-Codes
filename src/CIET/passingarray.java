package CIET;
import java.util.Arrays;

public class passingarray {
	static void printArray(int[] numbers) {
		for(int number:numbers) {
			System.out.println(number + " ");
		}
	}
	public static void main(String[] args) {
		int[] numbers = {10,20,30,40};
		printArray(numbers);
	}

}
