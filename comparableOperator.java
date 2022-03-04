package practice.operators;
import java.util.*;
import java.io.*;

class Student implements Comparable<Student>{
	int rollno;
	String name;
	int age;
	
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
	
	public int compareTo(Student st) {
		if(age==st.age)
			return 0;
		else if(age>st.age)
			return 1;
		else
			return -1;
	}
}
/**
 * @author Ishita.Singhal
 *
 */
public class comparableOperator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Student>as=new ArrayList<Student>();
		as.add(new Student(102,"Ashu",12));
		as.add(new Student(101,"Vansh",7));
		as.add(new Student(109,"Raj",3));
		
		Collections.sort(as);
		for(Student st:as) {
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}

	}

}
