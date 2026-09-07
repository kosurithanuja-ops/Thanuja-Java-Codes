package CIET;
interface Calculators{
	static int square(int n) {
		return n*n;
	}
}
public class StaticMethod {
     public static void main(String[] args) {
    	 int d = Calculators.square(5);
    	 System.out.println(d);
     }
}