package collectionsDayOne;

public class CustomShorting {

	int id;
	int marks;

	CustomShorting(int id,int marks){
		this.id=id;
		this.marks=marks;
	}
	@Override
	public String toString() {
		return "Id is "+id+" & Marks is"+marks;
	}                                                                                                       
}