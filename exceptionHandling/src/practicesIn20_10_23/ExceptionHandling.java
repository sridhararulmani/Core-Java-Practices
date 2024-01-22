package practicesIn20_10_23;

public class ExceptionHandling {
	public static void main(String[] args) {
		System.out.println("Car Stoped by repair");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException a) {
			System.out.println("Invalid Denominator");
		}
		catch(ArrayIndexOutOfBoundsException aa) {
			System.out.println("Invalid Boundry of Array");
		}
		catch(Exception e) {
			System.out.println("Execption Handled by Super Calss");
		}
		System.out.println("Car Started Succesfull");
	}
}
