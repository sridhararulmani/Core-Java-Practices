package constructorChaninigPassingArgivements;

public class employee {
	int id;
	String name;
	double salary;
	employee(int id){
		this.id=id;
	}
	employee(int id,String name){
		this(id);
		this.name=name;
	}
	employee(int id,String name,double salary){
		this(id,name);
		this.salary=salary;
	}
	public static void main(String[] args) {
		employee e=new employee(1,"Sridhar",3550);
		System.out.println("Ename :"+e.name);
		System.out.println("Eid :"+e.id);
		System.out.println("Esalary :"+e.salary);
	}
}