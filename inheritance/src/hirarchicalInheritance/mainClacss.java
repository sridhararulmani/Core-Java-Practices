package hirarchicalInheritance;

public class mainClacss {
	public static void main(String[] args) {
		student s=new student();
		s.study();
		System.out.println("Student Name :"+s.name);
		System.out.println("Student Marks :"+s.mark);
		System.out.println("-------------------------------------");
		employee e=new employee();
		e.work();
		System.out.println("Employee Name :"+e.name);
		System.out.println("Employee Salary :"+e.salary);		
	}
}