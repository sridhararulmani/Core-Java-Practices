package sortingExample;

import java.util.TreeSet;

public class ShortingUsingTreeset {
	public static void main(String[] args) {
		Person p1=new Person(10);
		Person p2=new Person(30);
		Person p3=new Person(20);
		
		TreeSet<Person> set=new TreeSet<Person>();
		set.add(p1);
		set.add(p2);
		set.add(p3);
		
		for(Person p:set) {
			System.out.println(p);
		}
	}
}
/** - If Object are not Comparable, TreesSet throws ClassCastException.
 *  - we can short Objects using Comparable & TreeSet.
 *  - TreeSet internally calls compareTo() for sorting Objects.
 */