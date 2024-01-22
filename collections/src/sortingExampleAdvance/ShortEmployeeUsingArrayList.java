package sortingExampleAdvance;

import java.util.ArrayList;
import java.util.Collections;

public class ShortEmployeeUsingArrayList {
	public static void main(String[] args) {
		Employee e1=new Employee(19);
		Employee e2=new Employee(40);
		Employee e3=new Employee(13);
		
		ArrayList<Employee>list=new ArrayList<Employee>();
		
		Collections.sort(list,new SortEmployeeById());
		
		for(Employee e:list) {
			System.out.println(e);
		}
	}
}
