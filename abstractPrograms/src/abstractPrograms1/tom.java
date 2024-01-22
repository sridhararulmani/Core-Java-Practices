package abstractPrograms1;

public class tom extends person{
	@Override
	void walk() {
		System.out.println("Walking");
	}
	public static void main(String[] args) {
		tom t=new tom();
		t.walk();
	}
}