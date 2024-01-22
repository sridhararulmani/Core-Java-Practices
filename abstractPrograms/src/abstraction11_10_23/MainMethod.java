package abstraction11_10_23;
import java.util.Scanner;
public class MainMethod extends CalculatorImp{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the vale of a");
		int a=sc.nextInt();
		System.out.println("Enter the vale of b");
		int b=sc.nextInt();
		CalculatorImp m=new MainMethod();
		m.add(a, b);
		m.mul(a, b);
		m.sub(a, b);
	}
}