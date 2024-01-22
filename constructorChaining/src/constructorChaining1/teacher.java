package constructorChaining1;

public class teacher extends student{
	teacher(String name){
		super(10);
		System.out.println("Teacher Name :"+name);
	}
	teacher(int age){
		this("Kavitha");
		System.out.println("Teacher Age :"+age);
	}
}