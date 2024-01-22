package emxampleProgramsForOverideTheReferenceAdderes;

public class Student {
	int age;
	String name;
	String gender;
	Student(int age,String name,String gen){
		this.age=age;
		this.name=name;
		this.gender=gen;
	}
	@Override
	public String toString() {
		return name+" is "+age+" years old "+gender;
	}
	public static void main(String[] args) {
		Student s1=new Student(22, "Sri","male");
		Student s2=new Student(21, "Thameem","male");
		Student s3=new Student(20, "Abi", "Female");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}