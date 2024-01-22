package TypeCasting;

public class MainMehtod {
	public static void main(String[] args) {
		father f=new father();
		son s=new son();
		daughter d=new daughter();
		System.out.println(s instanceof son);//true
		System.out.println(s instanceof father);//true
		System.out.println(d instanceof daughter);//true
		System.out.println(d instanceof father);//true
		System.out.println(f instanceof father);//true
		System.out.println(f instanceof son);//false
		System.out.println(f instanceof daughter);//false
		System.out.println(new son() instanceof father);//true
		System.out.println(new father() instanceof daughter);//false
	}
}
