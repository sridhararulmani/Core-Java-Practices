package constructorChaninigPassingArgivements;

public class student {
	int age;
	String name;
	student(int a){
		this.age=a;
	}
	student(int a,String n){
		this(a);
		this.name=n;
	}
	public static void main(String[] args) {
		student s=new student(22,"Sri");
		System.out.println("Age :"+s.age);
		System.out.println("Name :"+s.name);
	}
}