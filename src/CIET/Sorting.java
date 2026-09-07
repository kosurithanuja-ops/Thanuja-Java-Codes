package CIET;
import java.util.*;
class Student implements Comparable<Student> {
	String name;
	int marks;
	Student(int marks, String name) {
		this.marks=marks;
		this.name=name;
	}
	@Override
	public int compareTo(Student other) {
		return other.marks-this.marks;
	}
	public String toString() {
		return name+" "+marks;
	}
	
}
public class Sorting {
	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(90, "Komala"));
		students.add(new Student(20, "Prudhvi"));
		students.add(new Student(80, "Gnani"));
		students.add(new Student(99, "Pavi"));
		Collections.sort(students);
		System.out.println(students);
		
	}

}