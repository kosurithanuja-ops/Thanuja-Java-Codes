package CIET;
import java.util.*;

class Phone {
	int id;
	String name;
	double salary;
	Phone(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+" "+salary;l
	}

}
class EmployeeList{
	public static void main(String[] args) {
		List<Phone> em=Arrays.asList{
			new Phone(101,"chandan",45000),
			new Phone(102,"rahul",50000),
			new Phone(103,"rohit",55000)
		};
		for(Phone ef:em) {
			System.out.println(ef);
		}
	}
}
