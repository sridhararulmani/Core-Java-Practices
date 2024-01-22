package accessingPublicInSameClass;

public class solutiion {
	public static void main(String[] args) {
		employee e=new employee();
		employee.work();
		System.out.println("Employee Name :"+e.name);
		System.out.println("Employee Salary :"+e.Salary);
	}
}
