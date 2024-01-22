package sortingObjects;

public class Student implements Comparable<Student>{
	String name;
	int marks;
	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Name :"+name+" Marks :"+marks;
	}
	@Override
	public int compareTo(Student s) {
		return this.marks-s.marks;
	}
}