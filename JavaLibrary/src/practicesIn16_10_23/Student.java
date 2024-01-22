package practicesIn16_10_23;

public class Student {
	int age;
	Student(int age){
		this.age=age;
	}
	public static void main(String[] args) {
		Student s1= new Student(22);
		Student s2=new Student(22);
		System.out.println(s1.equals(s2));
	}
}