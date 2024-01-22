package interfacePrograms1;

public class customer implements atm{
	@Override
	public void deposit() {
		System.out.println("Depposit SuccesFully");
	}
	@Override
	public void withdraw() {
		System.out.println("Withdraw SuccesFully");
	}
	public static void main(String[] args) {
		customer c= new customer();
		c.deposit();
		c.withdraw();
	}
}
