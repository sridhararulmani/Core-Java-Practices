package collectionsPractices;
import java.util.Comparator;
import java.util.TreeSet;
public class MainMethod {
	public static void main(String[] args) {
		Employee e1=new Employee(02, "Sridhar", 50000);
		Employee e2=new Employee(01, "Srimathi", 50004);
		Employee e3=new Employee(03, "Srimathi2", 50004);

		ShotEmployeeById id=new ShotEmployeeById();
		ShortingByName name=new ShortingByName();
		ShortByInSalary sal=new ShortByInSalary();

		TreeSet<Employee> t=new TreeSet<Employee>(id);

		t.add(e1);
		t.add(e2);
		t.add(e3);

		for(Employee e:t) {
			System.out.println(e);
		}
	}
}
