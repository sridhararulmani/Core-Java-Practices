package accessingProtectedMembersInDifferentPackage;
import accesingPublicMembersInDifferentPackage.*;
public class flipcark extends person{
	public static void main(String[] args) {
		flipcark f=new flipcark();
		System.out.println(f.email);
		System.out.println(f.pass);
		mail();
	}
}