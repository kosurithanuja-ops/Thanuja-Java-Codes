class Student1{
	private String name;
	private int age;
	Student2(String name,int age){
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
 public class Encapsulation4{
	public static void main(String[] args) {
		 Student2 s = new  Student2("Thanuja",20);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		
		
	}
}
