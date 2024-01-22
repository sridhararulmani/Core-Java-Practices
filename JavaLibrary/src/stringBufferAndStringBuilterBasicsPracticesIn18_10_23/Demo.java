package stringBufferAndStringBuilterBasicsPracticesIn18_10_23;

public class Demo {
	public static void main(String[] args) {
		String s=new String("Java");
		System.out.println(s);
		System.out.println("----------------");
		s.concat(" Programs");
		System.out.println(s);
		System.out.println("----------------");
		
		String s1=new String("Java");
		System.out.println(s1);
		System.out.println("----------------");
		s1=s1.concat(" Programs");
		System.out.println(s1);
		System.out.println("----------------");
		
		String s2=new String("Good");
		System.out.println(s2);
		System.out.println("----------------");
		s2=s2.concat(" Afternoon");
		System.out.println(s2);
		System.out.println("----------------");
		
		StringBuffer s3=new StringBuffer("Woke");
		System.out.println(s3);
		System.out.println("----------------");
		s3=s3.append(" up!");
		System.out.println(s3);
		
		StringBuilder s4=new StringBuilder("dabba");
		System.out.println(s4);
		System.out.println("----------------");
		s4=s4.append(" Fello");
		System.out.println(s4);
		System.out.println("----------------");
		
		String s5=new String("Dabba");
		System.out.println(s5);//Dabba
		System.out.println("----------------");
		s5=s5.concat("Fello");
		System.out.println(s5);//DabbaFello
		System.out.println("----------------");
		
		String x="hello";
		System.out.println(x);
		System.out.println(x.length());
		System.out.println("----------------");
		x.concat(" world");
		System.out.println(x);
		System.out.println(x.length());
		System.out.println("----------------");
		x=x.concat(" world");
		System.out.println(x);
		System.out.println(x.length());
		System.out.println("----------------");
	}
}
