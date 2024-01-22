package collectionFramework;

import java.util.Comparator;

public class EmployeeShortBySalary implements Comparator<Employee>{
	@Override
	public int compare(Employee a,Employee b) {
		return a.salary.compareTo(b.salary);

		//		auto-Boxing to all compareTo() in Double class

		//		Double i=a.salary;	
		//		Double j=b.salary;
		//		return i.compareTo(j); //return j.compareTo(i);
	}
}
//x-> current object to be nsertes
//y-> alredy existing object
//return a.salary.compareTo(y.salary);(or) return b.salary.compareto(a.com)