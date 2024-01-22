package collectionsDayOne;

import java.util.TreeSet;

public class Calling {
	public static void main(String[] args) {
		CustomShorting s1=new CustomShorting(01, 100);
		CustomShorting s2=new CustomShorting(02, 200);
		CustomShorting s3=new CustomShorting(03, 300);
		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		
		Calling c=new Calling();
		TreeSet<CustomShorting> t=new TreeSet<CustomShorting>();
		t.add(s1);
		t.add(s2);
		t.add(s3);
		
		for(CustomShorting s:t) {
			System.out.println(s);
		}
	}
}
