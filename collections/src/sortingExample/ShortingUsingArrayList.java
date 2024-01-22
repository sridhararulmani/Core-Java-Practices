package sortingExample;

import java.util.ArrayList;
import java.util.Collections;

public class ShortingUsingArrayList {
	public static void main(String[] args) {
		Person p1=new Person(400);
		Person p2=new Person(3);
		Person p3=new Person(5);
		ArrayList<Person> list=new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);		
		Collections.sort(list); // compareTo() in Person
		for(Person p:list) {
			System.out.println(p);
		}
	}
}
/** - If Object are not Comparable, sort() throws Compilation Error.
 *  - we can short Objects using Comparable & List & sort().
 *  - sort() uses compareTo() for sorting Objects.
 */
