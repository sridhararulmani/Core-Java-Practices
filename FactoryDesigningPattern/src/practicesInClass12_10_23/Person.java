package practicesInClass12_10_23;
import java.util.Scanner;
public class Person extends Vehicle{
	static Vehicle selectTransport(int choise) {
		if(choise==1) {
			Bike b=new Bike();
			b.bike();
			return b;
		}
		else if(choise==2) {
			Car c= new Car();
			c.car();
			return c;
		}
		else if(choise==3) {
			Bus bb=new Bus();
			bb.bus();
			return bb;
		}
		else {
			System.out.println("Invalid");
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choise with 1 to 3");
		int choise=sc.nextInt();
		Vehicle v=Person.selectTransport(choise);
		
		if(v instanceof Bike) {
			System.out.println("Take Raid on Bike");
		}
		else if(v instanceof Car) {
			System.out.println("Take Raids on Car");
		}
		else if(v instanceof Bus) {
			System.out.println("Take Raid on Bus");
		}
		else {
			System.out.println("There is No Vehicle like you Asking");
		}
		/**
		 * -Factory Design Pattern is a process of wherein 1 method can return different types of objects (Generalization or upcasting)
		 * -selectTransport() can return 3 different types of objects & we cannot have 3 diff returnmhence we have avoid or handil it using generalization
		 * -if the return type is Car,the method can return only Car object(Specailization)
		 * -if the return type is Vehicle,the method can return car,bik &bus.
		 */
		}
}
