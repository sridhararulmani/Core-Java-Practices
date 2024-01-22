package practicesIn20_10_23;
import java.io.*;
public class CheckedException {
	public static void main(String[] args) {
		//Unhandled exception type FileNotFoundException
		try {
			FileReader f=new FileReader("sri.txt");
		}
		catch(Exception e) {
			System.out.println("File Not Present");
		}
		//Unhandled exception type InterruptedException
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			}
			catch(Exception a) {
				System.out.println("Somthing Went Wrong");
			}
		}
	}
}
