package array1;

public class demoClass {
	public static void main(String[] args) {
		//array declaration
		int[] a;
		//array object creation
		a=new int[3];
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("-------------------");
		//array initailization
		a[0]=10;
		a[1]=30;
		a[2]=40;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("-------------------");
		//array decleration & object creation
		int[] b=new int[2];
		//array initailization
		a[0]=10;
		a[1]=30;
		System.out.println(a[0]);
		System.out.println(a[1]);
	}
}