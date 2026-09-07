package CIET;
import java.util.Scanner;


public class Catch2 {

		public static void main(String[] args) {
			try {
				int[] arr= {10,20,30};
				System.out.println(arr[5]);
				
			}
			catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				
		}
			System.out.println("complete");
	}


}
