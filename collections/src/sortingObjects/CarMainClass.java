package sortingObjects;

import java.util.ArrayList;
import java.util.Collections;

public class CarMainClass {
	public static void main(String[] args) {
		Car c1=new Car(1000);
		Car c2=new Car(400);
		Car c3=new Car(2000);
		ArrayList<Car> list=new ArrayList<Car>();
		list.add(c1);
		list.add(c2);
		list.add(c3);		
		Collections.sort(list);
		for(Car c:list) {
			System.out.println(c);
		}
	}
}
/**
 * 1.sort() also uses compareTo() internally for sorting objects.
 * 2. If there are Car Object inside List,sort() goes in search of compareTo() in Car Class.
 * 3.therefore the Car Object should be Cpmparable in Nature.
 * 4.sort() can sort only List(ArrayList, LinkedList, Vector & Stack). 
 */