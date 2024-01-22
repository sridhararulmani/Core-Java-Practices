package practiceInCalss2_12_10_23;
import java.util.Scanner;
public class MainMethod extends Mobile{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choise");
		int choise=sc.nextInt();
		OnlineAppShooping a=selectApp(choise);
		
		if(a instanceof Mynthra) {
			System.out.println("Mynthera App Opened");
		}
		else if(a instanceof Amazon) {
			System.out.println("Amazon App opened");
		}
		else if(a instanceof Flipkart) {
			System.out.println("Flipkart App Opened");
		}
		else {
			System.out.println("Invalid App");
		}
	}
}
