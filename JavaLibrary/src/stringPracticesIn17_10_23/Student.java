package stringPracticesIn17_10_23;

public class Student {
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("-------------");
		
		System.out.println(s.hashCode());
		System.out.println("-------------");
		
		Student s1=new Student();
		Student s2=new Student();
		System.out.println(s1==s2);//Compair addresses or references
		System.out.println(s1.equals(s2));//Compair data or Contents
	}
}