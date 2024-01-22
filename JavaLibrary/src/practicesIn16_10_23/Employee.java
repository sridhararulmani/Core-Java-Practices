package practicesIn16_10_23;

public class Employee {
	int id;
	double sal;
	Employee(int id,double sal) {
		this.id=id;
		this.sal=sal;
	}
	public boolean equals(Object o) {
		Employee e=(Employee)o;
		return this.id==e.id&&this.sal==e.sal;
	}
	public static void main(String[] args) {
		Employee e1=new Employee(100, 1000);
		Employee e2=new Employee(100, 1000);
		System.out.println(e1.equals(e2));
		if(e1.equals(e2)) {
			System.out.println("Same Employee Details");
		}
		else {
			System.out.println("Diffeerent Employee Details");
		}
	}
}