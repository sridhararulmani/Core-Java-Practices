package mapExample;

import java.util.LinkedHashMap;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		LinkedHashMap <Integer,String> lMap=new LinkedHashMap <Integer,String>();
		lMap.put(10, "Sri");
		lMap.put(20, "Pro");
		lMap.put(30, "An");
		Set<Integer> keys=lMap.keySet();
		for( int key:keys) { // key ---> 10 20 30
			System.out.println(key+ " --> "+lMap.get(key));
		}
	}
}