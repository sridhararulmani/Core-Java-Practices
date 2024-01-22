package emxampleProgramsForOverideTheReferenceAdderes;

public class Car {
	int cost;
	Car(int c){
		this.cost=c;
	}
	@Override
	public String toString() {
		return "Cost is "+cost;
	}
	public static void main(String[] args) {
		Car c1=new Car(100);
		Car c2=new Car(200);
		Car c3=new Car(300);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}
}