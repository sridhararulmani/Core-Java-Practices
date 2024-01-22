package inheritanceMethodOverreadingHirarichalInheritance2;

public class whatsApp2 extends whatsApp1{	
	@Override
	void sentMessage() {
		super.sentMessage();
		System.out.println("version 2 updated Double tick you can get by this version");
	}
	void story() {
		System.out.println("version 2 added You can put image as a Story in this update");
	}
}
