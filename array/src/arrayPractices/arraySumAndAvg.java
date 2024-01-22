package arrayPractices;
import java.util.Scanner;
public class arraySumAndAvg {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size=sc.nextInt();
		System.out.println("Enter the elements into the Arrray");
		int array[]=new int[size];
		for(int i=0;i<=array.length-1;i++) {
			array[i]=sc.nextInt();
		}
		System.out.print("array={");
		for(int i=0;i<=array.length-1;i++){
			System.out.print(array[i]);
			if(array[i]<=array.length-1) {
				System.out.print(",");
			}
			else {
				System.out.print("};");
			}
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<=array.length-1;i++) {
			sum=sum+array[i];
		}
		System.out.println("Sum of the given array elements :"+sum);
		System.out.println("Average of the given Array elaments :"+sum/array.length);
	}
}