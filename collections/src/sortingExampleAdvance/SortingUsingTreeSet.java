package sortingExampleAdvance;

import java.util.TreeSet;

public class SortingUsingTreeSet {
	public static void main(String[] args) {
		TreeSet<Employee> set=new TreeSet<Employee>(new SortEmployeeById());
		set.add(new Employee(100));
		set.add(new Employee(300));
		set.add(new Employee(10));
		
		for(Employee e:set) {
			System.out.println(e);
		}
	}
}
