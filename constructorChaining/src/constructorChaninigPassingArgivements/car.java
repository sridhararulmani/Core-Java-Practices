package constructorChaninigPassingArgivements;
//this method is used to avoid the repetation of same pharameters and argivements
public class car {
	String brand;
	int cost;
	car(String brand){
		this.brand=brand;
	}
	car(int cost,String brand){
		this(brand);
		this.cost=cost;
	}
	public static void main(String[] args) {
		car c=new car(200,"Suziki");
		System.out.println("brand :"+c.brand);
		System.out.println("cost :"+c.cost);
	}
}