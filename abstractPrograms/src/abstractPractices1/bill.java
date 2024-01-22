package abstractPractices1;

public class bill extends customer{
	void pay() {
		super.shoping();
		this.casher();
		System.out.println("Pay the bill");
	}
	@Override
	void casher() {
		super.cart();
		super.casher();
		System.out.println("Ener the PIN to Bill paye");
	}
	public static void main(String[] args) {
		bill b=new bill();
		b.pay();
	}
}