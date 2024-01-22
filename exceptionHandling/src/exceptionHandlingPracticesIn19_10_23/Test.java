package exceptionHandlingPracticesIn19_10_23;

public class Test {
	public static void main(String[] args) {
		System.out.println("Statr");
		int[] a= {10,20,40,30};
		try {
			System.out.println(a[3]);	
		}
		catch(ArrayIndexOutOfBoundsException b){
			System.out.println("Invalid Index");
		}
		System.out.println("End");
	}
}
