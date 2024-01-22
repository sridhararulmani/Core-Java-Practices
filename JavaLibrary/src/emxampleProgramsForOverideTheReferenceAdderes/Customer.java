package emxampleProgramsForOverideTheReferenceAdderes;

public class Customer{
	public static void main(String[] args) {
		Hotel h1=new Hotel("Thaj", 4.5);
		Hotel h2=new Hotel("Udupi", 5.7);
		Hotel[] h= {h1,h2};
		for(int i=0;i<h.length;i++) {
			System.out.println(h[i]);
		}
	}
}