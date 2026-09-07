package CIET;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		try {
			int result=10/0;
		}
		catch(ArithmeticException e) {
			System.out.println("can't divide by zero");
		}
	}
}
