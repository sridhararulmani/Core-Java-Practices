package constructorChaining1;

public class student {
	student(String name){
		System.out.println("Student Name :"+name);
	}
	student(int age){
		this("Sri");
		System.out.println("Student Age :"+age);
	}
}