package inheritanceMethodOverreadingHirarichalInheritance2;

public class whatsApp3 extends whatsApp2{
	@Override
	void sentMessage() {
		super.sentMessage();
		System.out.println("version 3 updated Blue tick you can get from this update");
	}
	@Override
	void story() {
		super.story();
		System.out.println("version 3 updated You can put vedio as a Story in this update");
	}
	void payment() {
		System.out.println("version 3 added You ca make payment in this update");
	}
}