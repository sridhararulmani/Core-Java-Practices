package kavinQuestions;
import java.util.Iterator;
import java.util.Scanner;
public class Qustion {
	public static int[] getArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of the Array");
		int size=sc.nextInt();
		int[] array=new int[size];
		System.out.println("Enter the Elements for Array");
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextInt();
		}
		return array;
	}
	public static int[] sumOfTheArrays(int[] arrayN,int[] arrayM){
		int[] sumArray=new int[sizeOfSummArray(arrayN,arrayM)];
		for(int i=0;i<sumArray.length;i++) {
			sumArray[i]=arrayN[i]+arrayM[i];
		}
		return sumArray;
	}
	public static int sizeOfSummArray(int[] arrayN,int[]arrayM) {
		if(arrayN.length>=arrayM.length){
			return arrayM.length;
		}
		return arrayN.length;
	}
	public static void printArray(int[] arrayN,int[] arrayM) {
		int[] sumArray=sumOfTheArrays(arrayN,arrayM);
		for(int i=0;i<sumArray.length;i++) {
			System.out.print(sumArray[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arrayN=getArray();
		int[] arrayM=getArray();
		printArray(arrayN, arrayM);
	}
}