package practicesProgram;

import java.util.ArrayList;

public class HeterogeneousElementsInOneObject {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(100);
		l.add("String 1");
		l.add(1.8);
		l.add("string 2");
		for(Object obj :l) {
			if(obj instanceof Double||obj instanceof Integer) {
				System.out.println(obj);
			}
		}
	}
}