package javabean;

public class mainClass {
	public static void main(String[] args) {
		car c=new car();
		c.setBrand("BMW");
		String brand=c.gettBrand();
		System.out.println("1-Brand :"+brand);
		//another one object creation with different Initailization and Store the value in same member.
		//car c2=new car();
		//c2.setBrand("Audi");
		//brand=c2.gettBrand();
		//System.out.println("2-Brand :"+brand);
	}
}
//The Access Specifier & return type of setter() is always public void.
//The Access Specifier of getter() is always public.
//The return type of getter()