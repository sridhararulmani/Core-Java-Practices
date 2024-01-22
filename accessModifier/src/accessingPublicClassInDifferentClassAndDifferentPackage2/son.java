package accessingPublicClassInDifferentClassAndDifferentPackage2;
import accessingPublicClassInDifferentClassAndDifferentPackage.*;
public class son extends father {
	public static void main(String[] args) {
		son s=new son();
		System.out.println("Father name :"+s.name);
		s.walk();
	}
}