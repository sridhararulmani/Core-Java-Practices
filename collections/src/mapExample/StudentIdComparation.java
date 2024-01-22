package mapExample;

import java.util.TreeSet;

import mapExamplePracticesIn15_11.Student;

public class StudentIdComparation {
	public static void main(String[] args) {
		Student s1=new Student(102, 22, "Sridhar");
		Student s6=new Student(103, 23, "Ananya");
		Student s2=new Student(100, 22, "Dinesh");
		Student s3=new Student(108, 22, "Suji");
		Student s4=new Student(106, 22, "Vasi");
		Student s5=new Student(105, 22, "Mei");
		TreeSet<Student> set=new TreeSet<Student>(new SutudentShortById());
		set.add(s1);
		set.add(s6);
		set.add(s3);
		set.add(s4);
		set.add(s5);
		set.add(s2);
		
		for(Student s:set) {
			System.out.println(s);
		}
	}
}