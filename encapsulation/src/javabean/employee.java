package javabean;

public class employee {
	private int id;
	private String name;
	private double salary;
	
	public void setId(int ID) {
		this.id=ID;
	}
	
	public void setName(String n) {
		this.name=n;
	}
	
	public void setSalary(double s) {
		this.salary=s;
	}
	
	public int gettId() {
		return id;
	}
	
	public String gettName() {
		return name;
	}
	
	public double gettSalary() {
		return salary;
	}
}