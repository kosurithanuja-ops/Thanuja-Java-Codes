package CIET;

class Students implements Comparable<Students>{
	int marks;
	Students(int marks){
		this.marks=marks;
	}
	@Override
	public int compareTo(Students other) {
		return this.marks-other.marks;
	}
		
	}

public class Comparable1 {
	public static  void main(String[] args) {
		Students s1=new Students(80);
		Students s2=new Students(99);
		int s=s1.compareTo(s2);
		System.out.println(Math.abs(s));
	}

}
