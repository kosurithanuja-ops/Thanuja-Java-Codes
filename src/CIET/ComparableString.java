package CIET;

import java.util.*;

class Child1 implements Comparable<Child1> {
    String name;
    Child1(String name) {
        this.name = name;
    }
    @Override
    public int compareTo(Child1 other) {
        return this.name.compareTo(other.name);
    }
    public String toString() {
        return name;
    }
}
public class ComparableString {
    public static void main(String[] args) {
        ArrayList<Child1> child = new ArrayList<>();
        child.add(new Child1("Ravi"));
        child.add(new Child1("Anil"));
        child.add(new Child1("Siva"));
        child.add(new Child1("Tharun"));

        System.out.println("Before Sorting:");
        System.out.println(child);
        Collections.sort(child);
        System.out.println("After Sorting:");
        System.out.println(child);
    }
}