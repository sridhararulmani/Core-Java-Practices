package collectionsDayOne;

import java.util.Comparator;

public class Clled implements Comparator <CustomShorting>{

	@Override 
	public int compare(CustomShorting x,CustomShorting y) {
		return x.id-y.id;
	}
}
