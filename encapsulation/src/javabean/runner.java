package javabean;
import java.util.*;
public class runner {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		System.out.println("Enter the salary of enmployee");
		double salary=sc.nextDouble();
		
		System.out.println("Enter the Name of employee");
		String name=sc.next();
		
		employee e=new employee();
		
		e.setId(id);
		e.setName(name);
		e.setSalary(salary);
		
		int i=e.gettId();
		String n=e.gettName();
		double s=e.gettSalary();
		
		System.out.println("Employee ID :"+i);
		System.out.println("Employee Name :"+n);
		System.out.println("Employee Salary :"+s);
	}
}