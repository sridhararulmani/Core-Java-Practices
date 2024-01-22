package constructorChaining1;

public class employee {
	employee(int age){
		this(10,"Sri");
		System.out.println("Age :"+age);
	}
	employee(int id,String name){
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
	}
	employee(double salary){
		this(20);
		System.out.println("Salary: "+salary);
	}
	public static void main(String[] args) {
		System.out.println("	Employee Details");
		new employee(25000.60);
	}
}