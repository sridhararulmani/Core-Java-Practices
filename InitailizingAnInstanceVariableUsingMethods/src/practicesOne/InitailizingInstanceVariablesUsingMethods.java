package practicesOne;

public class InitailizingInstanceVariablesUsingMethods {

	String accountHolderName;
	long accountNumber;
	
	public void initalizing(String n,long aNum) {
		this.accountHolderName=n;
		this.accountNumber=aNum;
		this.print();
	}
	
	public void print() {
		System.out.println(accountHolderName);
		System.out.println(accountNumber);
	}
	
	public static void main(String[] args) {
		InitailizingInstanceVariablesUsingMethods i=new InitailizingInstanceVariablesUsingMethods();
		i.initalizing("Sridhar", 9787664543467l);
		
		
		System.out.println(i.accountHolderName);
		System.out.println(i.accountNumber);
	}
}