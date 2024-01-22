package collectionsPractices;

import java.util.Comparator;

public class ShotEmployeeById implements Comparator<Employee>{

	@Override
	public int compare(Employee e1,Employee e2) {
		//		for assending order
		return e1.id-e2.id; 
		//		for Desending order
		//		return e2.id-e1.id;
	}
}
//x is the Current object to be inserted 
//y is the alredy exisating object