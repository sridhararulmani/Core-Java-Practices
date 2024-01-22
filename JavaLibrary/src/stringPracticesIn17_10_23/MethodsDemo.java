package stringPracticesIn17_10_23;

public class MethodsDemo {
	public static void main(String[] args) {
		String s="Software Engineer";
		System.out.println(""+s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("soft"));
		System.out.println(s.endsWith("neer"));
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf('e'));
		System.out.println(s.contains("ware"));

		System.out.println("-----------------");

		String a="Java";
		String b="Java";
		String c="JaVA";
		System.out.println("Java == Java :"+a.equals(b));
		System.out.println("Java == JaVA :"+a.equals(c));
		System.out.println("Java have all char in JaVA :"+a.equalsIgnoreCase(c));

		System.out.println("------------------------");

		String x="Hello World";
		System.out.println(x.toUpperCase());
		System.out.println(x.toLowerCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(7));
		System.out.println(x.substring(2,8));
		System.out.println(x.substring(1,10));
	}
}