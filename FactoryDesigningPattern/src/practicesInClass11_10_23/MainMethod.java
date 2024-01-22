package practicesInClass11_10_23;
import java.util.Scanner;
public class MainMethod extends Hottel{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Order Code Within 3");
		int order=sc.nextInt();
		Hottel h=new Hottel();
		
		//Ineternally if choise is 1-food obj=new BIriyani();
		//Internally if choise is 2-Food obj=new Pizza();
		//Internally if choise is 3-food obj=new Burder();
		//Internally if choise is 4,5....-food obj=null;
		h.lb();
		Food obj=h.orderFood(order);
		
		if(obj instanceof Biriyani) {
			System.out.println("Enjoy Biriyani");
		}
		else if(obj instanceof Pizza) {
			System.out.println("Enjoy Pizza");
		}
		else if(obj instanceof Burger) {
			System.out.println("Enjoy Burger");
		}
		else{
			System.out.println("Invalid Order");
		}
	}
}
