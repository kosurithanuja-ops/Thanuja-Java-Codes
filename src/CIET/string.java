package CIET;
import java.util.Scanner;
import java.util.Arrays;

public class string {
	public static void main(String[] args) {
		//using string literal
		String s1 = "Hello";
		
		
		String s2 = new String("Welcome");
		
		
		char[] letter = {'j','a','v','a'};
		String s3 = new String(letter);
		
		
		byte[] data = {65,66,67};
		String s4 = new String(data);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
