package finalyBlockTryAndCatchPractices;

public class Student {
	int salary;
	public Student(int salary) {
		this.salary=salary;
	}
	public static int div(int sal) throws Exception{
		sal=sal/0;
		return sal;
	}
	public static void main(String[] args) {
		Student s=new Student(10);
		System.out.println(10-1);
		try {
			int divdedAnser=div(s.salary);
			System.out.println(divdedAnser);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}