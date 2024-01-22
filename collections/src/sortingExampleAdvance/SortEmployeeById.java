package sortingExampleAdvance;

import java.util.Comparator;

public class SortEmployeeById implements Comparator<Employee>{
	@Override
	public int compare(Employee a,Employee b) {
		Integer i=a.id;
		Integer j=b.id;
		return i.compareTo(j);// return j.compareTo(i);
	}
}
//x-> current Object to be inserted
//y-> already existing object
//return a.id - b.id ; return b.id - a.id;