
package CIET;
import java.util.Scanner;

public class Throw {
	public static void main(String[] args) {
		int age=16;
		if(age<18) {
			throw new IllegalArgumentException("age must be 18 or above");
		}
	}

}
