package sortingObjects;

public class Car implements Comparable<Car>{
	int cost;
	Car(int cost){
		this.cost=cost;
	}
	@Override
	public String toString() {
		return "Cost :"+cost;
	}
	@Override
	public int compareTo(Car c) {
		return this.cost - c.cost;
	}
}
//	this -> current object to be inserted
//	c-> already existing object