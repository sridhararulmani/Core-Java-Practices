package collectionsPractices;

import java.util.Comparator;

public class ShortingByName implements Comparator<Employee>{
	@Override
	public int compare(Employee e1,Employee e2) {
		return e1.name.compareTo(e2.name);
		//		desending return e2.name.compareTo(e1.name);
	}
}
//x is current object to be inserted
//y is the already existing object 
//for String comparision ,we should use compareTo() of String class.