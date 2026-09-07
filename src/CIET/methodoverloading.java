package CIET;
import java.util.Scanner;

public class methodoverloading {
	void add(int a) {
		System.out.println(a);
		
	}
	void add(double a) {
		System.out.println(a);
		
	}
	void add(int b,int c) {
		System.out.println(b+c);
	}
	void add(int b, double c) {
		System.out.println(b+c);
	}
	
		public static void main(String[] args) {
			methodoverloading l = new methodoverloading();
			l.add(12);
			l.add(12.5);
			l.add(12,13);
		
	}

}
