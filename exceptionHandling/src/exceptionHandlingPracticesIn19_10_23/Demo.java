package exceptionHandlingPracticesIn19_10_23;
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a Value");
		int a=sc.nextInt();
		System.out.println("Enter the b Value");
		int b=sc.nextInt();
		try {
			System.out.println("Devision of a/b :"+a/b);
		}
		catch(ArithmeticException c){
			System.out.println("Donot Devided by 0 anything");
		}
		System.out.println("End");
	}
}