package mapExample;

//import java.util.*;

import java.util.LinkedHashMap;
import java.util.Set;

public class MainClass {
	public static void main(String[] args) {
		LinkedHashMap<String , Double> map=new LinkedHashMap<String , Double> ();
		map.put("A",  2.0);
		map.put("B", 3.0);
		Set<String>keys=map.keySet();
		for(String key:keys) { // key=A,B
			System.out.println("Salary of "+key+" is "+map.get(key)+" LPA");
		}		
	}
}