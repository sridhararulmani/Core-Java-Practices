package collectionFramework;

import java.util.Comparator;

public class EmployeeShortById implements Comparator<Employee>{
	@Override
	public int compare(Employee a,Employee b) {
		return	a.id - b.id;
	}
}