package emxampleProgramsForOverideTheReferenceAdderes;

public class Hotel {
	String hotelName;
	double rate;
	Hotel(String name,double rate){
		this.hotelName=name;
		this.rate=rate;
	}
	@Override
	public String toString() {
		return "Hotel Name is "+hotelName+" Rating is "+rate;
	}
}