package sortingObjects;
import java.util.ArrayList;
import java.util.Collections;
public class StudentMainClass {
	public static void main(String[] args) {
		Student s1=new Student("Sridhar", 100);
		Student s2=new Student("Dinesh", 79);
		Student s3=new Student("Suji", 60);
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		Collections.sort(list);
		System.out.println("Higest Score in Class");
		System.out.println();
		Student Highest=list.get(list.size()-1);
		System.out.println(Highest);
		System.out.println("---------------------------------");
		System.out.println("Lowest Score in Class");
		System.out.println();
		Student Lowest=list.get(0);
		System.out.println(Lowest);
		System.out.println("---------------------------------");
		System.out.println("Markes in the Range of 61 - 81");
		System.out.println();
		for(Student s:list) {
			if(s.marks>=61 && s.marks<=81){
				System.out.println(s);
			}
		}
	}
}