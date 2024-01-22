package mapExamplePracticesIn15_11;

import java.util.LinkedHashMap;
import java.util.Set;

public class StudentMainClass {
	public static void main(String[] args) {
		Student s1=new Student(22, "Sri");
		Student s2=new Student(22, "Dinesh");
		Student s3=new Student(23, "Suji");
		
		LinkedHashMap<Student,Double> map=new LinkedHashMap<Student,Double>();
		
		map.put(s1, 5.6); //map.put(new Student(22, "Sri"));
		map.put(s2, 5.9); //map.put(new Student(22, "Dinesh"));
		map.put(s3, 5.98); //map.put(new Student(23, "Suji"));
		
		Set<Student> keys=map.keySet();
		for(Student key:keys) {
			System.out.println(key+" Height :"+map.get(key));
		}
	}
}
