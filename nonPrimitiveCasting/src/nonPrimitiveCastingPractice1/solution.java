package nonPrimitiveCastingPractice1;
//Basic for upCasting and downCasting
public class solution {
	public static void main(String[] args) {
		
		System.out.println("UpCasting");
		System.out.println();
		
		//upCasting
		vehicle v= new car();
		System.out.println(v.brand);
		v.start();
		System.out.println("--by upcasting we can access only super class members using super class refferance variable");
		
		System.out.println();
		System.out.println("DownCasting");
		System.out.println();
		
		//downCasting
		car c= (car) v;
		System.out.println(c.brand);
		System.out.println(c.color);
		c.start();
		c.stop();
		System.out.println("--We can access both super ans subClass members using subClass reference Variable");
	}
}
