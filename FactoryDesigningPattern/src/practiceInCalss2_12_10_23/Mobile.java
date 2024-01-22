package practiceInCalss2_12_10_23;

public class Mobile extends OnlineAppShooping{
	static OnlineAppShooping selectApp(int c){
		if(c==1) {
			Mynthra m=new Mynthra();
			return m;
		}
		else if(c==2) {
			Amazon a=new Amazon();
			return a;
		}
		else if(c==3) {
			Flipkart f=new Flipkart();
			return f;
		}
		else {
			return null;
		}
	}
}