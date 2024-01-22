package interfaceExample;

public class Tom implements Employee{
	@Override
	public void work() {
		System.out.println("Tom working....");
	}
	public static void main(String[] args) {
		
		//		Employee e=new Tom(); //upcasting
		//		e.work();

		Tom t=new Tom();
		t.work();
	}
}
