package multiLevelInheritances;

public class driver {
	public static void main(String[] args) {
		distrct d=new distrct();
		System.out.println("Contry Name ஶ்ரீதர்:"+d.contryName);
		System.out.println("District Name :"+d.districtName);
		System.out.println("State Name :"+d.stateName);
		System.out.println("--------------------------");
		d.enjoyInSalem();
		d.electPM();
		d.electCm();
	}
}
