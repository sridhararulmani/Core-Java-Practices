package stringPracticesIn17_10_23;

public class Demo {
	public static void main(String[] args) {
		String s=new String("A");
		System.out.println(s);
		System.out.println(s.toString());
		System.out.println("-------------");
		
		System.out.println(s.hashCode());
		System.out.println("-------------");
		
		String s1=new String("Java");
		String s2=new String("Java");
		System.out.println(s1==s2);//Compair addresses or references
		System.out.println(s1.equals(s2));//Compair data or Contents
	}
}