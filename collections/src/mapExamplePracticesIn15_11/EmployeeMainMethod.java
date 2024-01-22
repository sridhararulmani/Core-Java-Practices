package mapExamplePracticesIn15_11;
import java.util.Set;
import java.util.TreeMap;
public class EmployeeMainMethod {
	public static void main(String[] args) {
		Employee e1=new Employee(100);
		Employee e2=new Employee(300);
		Employee e3=new Employee(200);
		
		TreeMap<Employee,String> map=new TreeMap<Employee, String>();
		map.put(e1, "Sridhar");
		map.put(e2, "Thameem");
		map.put(e3, "Dinesh");
		
		Set<Employee> keys=map.keySet(); // e1 e2 e3
		for(Employee e:keys) {
			System.out.println(e+" Name: "+map.get(e));
		}
	}
}