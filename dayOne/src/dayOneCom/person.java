package dayOneCom;

public class person {
	int age;
	String name;
	double height;
	person(int a,String n,double h){
		this.age=a;
		this.name=n;
		this.height=h;
	}
	public static void main(String[] args) {
		person p1=new person(20,"Sridhar",160.7);
		person p2=new person(10,"Sri",170.7);
		System.out.println("Persons age is :"+p1.age);
		System.out.println("Persons age is :"+p1.name);
		System.out.println("Persons age is :"+p1.height);
		System.out.println("---------------------------------------");
		System.out.println("Persons age is :"+p2.age);
		System.out.println("Persons age is :"+p2.name);
		System.out.println("Persons age is :"+p2.height);
	}
}
