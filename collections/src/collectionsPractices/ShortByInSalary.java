package collectionsPractices;

import java.util.Comparator;

public class ShortByInSalary implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2) {
		return e1.salary.compareTo(e2.salary);
	}
}