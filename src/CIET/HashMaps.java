package CIET;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class HashMaps {
	public static void main(String[] args) {
		HashMap<Integer,String> Scanner=new HashMap<>();
		Scanner.put(101, "john");
		Scanner.put(103,null);
		Scanner.put(null,"naga");
		Scanner.put(102, "smith");
		System.out.println(Scanner);
		System.out.println(Scanner.get(101));
		System.out.println(Scanner.containsKey(101));
		System.out.println(Scanner.containsValue("john"));
		
	}

}
