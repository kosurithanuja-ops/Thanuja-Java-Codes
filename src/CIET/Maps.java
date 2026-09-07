package CIET;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Maps {
	public static void main(String[] args) {
		Map<Integer,String> students=new HashMap<>();
		students.put(100, "chandan");
		students.put(101, "rahul");
		students.put(102,"Anil");
		System.out.println(students);
		System.out.println(students.get(100));
		students.remove(101);
		System.out.println(students);
		students.put(100, "archana");
		System.out.println(students);
		
	}

}
