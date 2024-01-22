package collectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ShortingEmployee {
	public static void main(String[] args) {
		ArrayList<Employee> list=new ArrayList<Employee>();
		Employee e1=new Employee(10, "A", 2.5);
		Employee e2=new Employee(40, "C", 3.5);
		Employee e3=new Employee(30, "B", 1.5);

		list.add(e1);
		list.add(e2);
		list.add(e3);

		Collections.sort(list,new EmployeeShortById());
		System.out.println("Shorted by ID:");
		System.out.println("--------------------------------");
		for(int u=0;u<list.size();u++) {
			System.out.println(list.get(u));
		}
		System.out.println();

		EmployeeShortByName name=new EmployeeShortByName();
		Collections.sort(list,name);
		System.out.println("Shorted by NAME:");
		System.out.println("--------------------------------");
		for(Employee e:list) {
			System.out.println(e);
		}
		System.out.println();

		Collections.sort(list,new EmployeeShortBySalary());
		Iterator<Employee>i=list.iterator();
		System.out.println("Shorted by SALARY:");
		System.out.println("--------------------------------");
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
	}
}
