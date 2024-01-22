package practicesIn16_10_23;

public class Car {
	double cost;
	Car(int c){
		this.cost=c;
	}
	@Override
	public boolean equals(Object obj) {	//uc->Object obj=new car(24000);
		Car c=(Car)obj;					//downcasting
		return this.cost==c.cost;		//comparision logic
	}
	public static void main(String[] args) {
		Car c1=new Car(25000);
		Car c2=new Car(24000);
		System.out.println(c1.equals(c2));//ture
		if(c1.equals(c2)) {
			System.out.println("Cost is Same");
		}
		else {
			System.out.println("Cost is Differnt");
		}
	}
}
//c1->this
//c2->obj->c