package abstraction11_10_23;

public class CalculatorImp implements Calculator{
	@Override
	public void add(int a,int b) {
		System.out.println("Sum of the inputs is "+(a+b));
	}
	@Override
	public void mul(int a,int b) {
		System.out.println("Product of the input is "+(a*b));
	}
	@Override
	public void sub(int a,int b) {
		System.out.println("Sub of the input is "+(a-b));
	}
}