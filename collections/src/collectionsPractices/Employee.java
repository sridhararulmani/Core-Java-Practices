package collectionsPractices;

public class Employee {
	int id;
	String name;
	Double salary;
	Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Id is "+id+" Name is "+name+" Salary is "+salary;
	}
}
