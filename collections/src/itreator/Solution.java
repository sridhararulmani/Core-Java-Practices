package itreator;

import java.util.ArrayList;
import java.util.Iterator;

public class Solution {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(200);
		list.add(300);
		list.add(400);

		//		Traverse using Iterators 
		Iterator<Integer> itr=list.iterator();//generates address
		while(itr.hasNext()) { // checks if object is there or not
			System.out.println(itr.next()); //return the object
		}
		System.out.println("---------------");
		
		//		Traversing using for each loop
		for(int i:list) {
			System.out.println(i);
		}
		System.out.println("--------------------");
		
		//		Traversing using normal for loop
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------");
	}
}
