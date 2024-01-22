package javabean;
import java.util.*;
public class solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int a=sc.nextInt();
		person p=new person();
		p.setAge(a);
		
		System.out.println(p.gettAge());
	}
}
