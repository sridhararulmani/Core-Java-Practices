package practicesIn16_10_23;

public class Student2 {
	int age;
	Student2(int age) {
		this.age=age;
	}
	@Override
	public boolean equals(Object o) {//1-Object o=new Object();
		Student2 s=(Student2)o;//2->downCasting
		return this.age==s.age;//3->s1.age==s2.age-> 22==22->true
	}
	public static void main(String[] args) {
		Student2 s1=new Student2(22);
		Student2 s2=new Student2(22);
		System.out.println(s1.equals(s2));//s1.equals(new Student(22));
	}
}
/**
 * 1.s1->this
 * 2.s2->o (Upcasting reference)-> s(downCasting reference)
 * 3.Tn the above program, upcasting is achived only when we call equals()
 */