package CIET;

 class Student{
	private String name;
	private int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	

}
 public class Encapsulation3{
	public static void main(String[] args) {
		 Student s = new  Student("Thanuja",20);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
		
	}
}
