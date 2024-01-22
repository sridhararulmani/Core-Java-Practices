package practicesIn20_10_23;

public class UncheckedException {
	public static void main(String[] args) {
		//Not Handling Immediately ->ArrayINdexOutOfBoundadsException
		int[] a= {10,23};
		System.out.println(a[99]);
		
		//Not Handling Immediately -> ArithmeticException
		System.out.println(10/0);
	}
}
