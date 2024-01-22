package abstractPractices1;

public class customer extends owner{
	@Override
	void shoping() {
		System.out.println("Shop");
	}
	@Override
	void casher() {
		System.out.println("Swipe the card in cash counter");
	}
	static void cart() {
		System.out.println("Customer Purchesing Things");
	}
}
