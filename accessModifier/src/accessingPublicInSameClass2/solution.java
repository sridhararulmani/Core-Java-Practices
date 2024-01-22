package accessingPublicInSameClass2;
import accesingPublicMembersInDifferentPackage.*;
public class solution {
	public static void main(String[] args) {
		car c=new car();
		System.out.println("Car Brand"+car.brand);
		System.out.println("Car cost :"+c.cost);	
	}
}