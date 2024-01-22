package nonPrimitiveCasting;

public class mainClass {
	public static void main(String[] args) {
		/*son s= new son();
		father f=s;*/

		//with out extends we can cast the super & sub class

		//upCasting 
		father f=new son();
		System.out.println(f.name);

		//downCasting 
		son s=(son)f;
		System.out.println(s.age);
		System.out.println(s.name);
	}
}
