package abstractProgram2;

public class user extends paytm{
	@Override
	void cart() {
		System.out.println("Purchesing");
	}
	@Override
	void pay() {
		System.out.println("Pying");
	}
	public static void main(String[] args) {
		user u=new user();
		u.cart();
		u.pay();
	}
}
