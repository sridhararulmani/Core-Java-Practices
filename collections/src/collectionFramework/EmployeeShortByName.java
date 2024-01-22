package collectionFramework;

import java.util.Comparator;

public class EmployeeShortByName implements Comparator<Employee>{
	@Override
	public int compare(Employee a,Employee b) {
		return a.name.compareTo(b.name);
	}
}