package practicesInClass11_10_23;

public class Hottel {
	/*
	 * -if the return type is food,it can
	 */
	void lb() {
		System.out.println("---menu---");
	}
	 Food orderFood(int choise){
		 
		if(choise==1) {
			Biriyani b=new Biriyani();
			b.food();
			b.biriyani();
			return b;//return Biriyani
		}
		else if(choise==2) {
			Pizza p=new Pizza();
			p.food();
			p.pizza();
			return p;//return Pizza
		}
		else if(choise==3) {
			Burger b=new Burger();
			b.food();
			b.burgur();
			return b;//return Burger
		}
		else {
			return null;
		}
	}
}