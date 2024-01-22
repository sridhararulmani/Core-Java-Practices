package arrayProgram3;
import java.util.*;
public class ckeckingBalance {
	double actualBalance;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Acutual Balance");
		double aB=sc.nextDouble();
		bank a1=new bank("Sridhar",232456);
		bank a2=new bank("srimathi",450070);
		bank a3=new bank("revathi",689874);
		bank[] b= {a1,a2,a3};
		for(int i=0;i<=b.length-1;i++) {
			if(b[i].salary>=aB){
				System.out.println("Name  :"+b[i].name);
				System.out.println("Balance :"+b[i].salary);
			}
		}
	}
}