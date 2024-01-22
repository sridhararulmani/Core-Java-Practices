package javabean;

public class person {
	private int age;
	
	public void setAge(int a){
		if(a>0) {
			this.age=a;
			System.out.println("Age get initalization");
		}
		else{
			System.out.println("Invalid age");
		}
		
	}
	public int gettAge() {
		return age;
	}
}
