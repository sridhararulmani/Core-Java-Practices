package mapExample;

import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class Demo {
	public static void main(String[] args) {
		HashMap map=new HashMap();
		map.put(10, "Java");
		map.put("Apti", 10.1);
		map.put(1.5, 555);

		System.out.println(map); // {1.5=555, 10=Java, Apti=10.1}
		System.out.println(map.size()); //3
		System.out.println(map.get(10)); //Java
		System.out.println(map.get(25)); //null
		System.out.println(map.containsKey("Apti")); //true
		System.out.println(map.containsValue("Java")); //true
		System.out.println("--------");
		
		System.out.println(map); //{1.5=555, 10=Java, Apti=10.1}
		map.remove(1.5);
		map.replace("Apti", "Kopti");
		System.out.println(map); //{10=Java, Apti=10.1}
		System.out.println("-----");
		
		System.out.println(map.isEmpty()); //false
		map.clear();
		System.out.println(map.isEmpty()); //true
	}
}