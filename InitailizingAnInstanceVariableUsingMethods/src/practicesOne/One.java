package practicesOne;

public class One {

	String name;
	
	One(String name){
		this.name=name;
	}
	public void print() {
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		One o = new One("Sherin");
		
		System.out.println(o.name);
		o.print();
	}
}