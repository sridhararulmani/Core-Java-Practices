package arrayPerogram2;

public class mainClass {
	public static void main(String[] args) {
		hottel h1=new hottel(4.5,"Avm");
		hottel h2=new hottel(3.3,"RR");
		hottel h3=new hottel(4.7,"KFC");
		hottel h4=new hottel(4.5,"SARAVANA");
		hottel[] h= {h1,h2,h3,h4};
		/*hottel[] h=new hottel[4];
		h[0]=h1;
		h[1]=h2;
		h[2]=h3;
		h[3]=h4;*/
		System.out.println("Hottels in Ratting bettween 4.2 to 4.7");
		System.out.println("-----------------------------------------");
		for(int i=0;i<=h.length-1;i++) {
			if(h[i].ratting>=4.2&&h[i].ratting<=4.7) {
				System.out.println("Hotel Name :"+h[i].hotelName);
			}
		}
	}
}
