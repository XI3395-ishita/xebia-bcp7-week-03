package practice.operators;
import java.util.*;
import java.io.*;

class Student{
	int rollno;
	String name;
	int age;
	
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}


class AgeComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
}

class NameComparator implements Comparator<Student>{
	public int compare(Student s1,Student s2) {
		return s1.name.compareTo(s2.name);
	}
}

/**
 * @author Ishita.Singhal
 *
 */
public class comparatorOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(102,"Ashu",12));
		al.add(new Student(101,"Vansh",7));
		al.add(new Student(109,"Raj",3));
		
		System.out.println("Sorting by name");
		
		Collections.sort(al,new NameComparator());
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
		
		System.out.println("Sorting by age");
		
		Collections.sort(al,new AgeComparator());
		for(Student st:al) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
