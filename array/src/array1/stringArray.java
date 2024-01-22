package array1;

public class stringArray {
	public static void main(String[] args) {
		String[] sub= {"Tamil","English","Maths","Science"};
		for(int i=0;i<=sub.length-1;i++) {
			System.out.println(i+" - "+sub[i]);
		}
		System.out.println("---------");
		for(int i=sub.length-1;i>=0;i--) {
			System.out.println(i+" - "+sub[i]);
		}
	}
}
