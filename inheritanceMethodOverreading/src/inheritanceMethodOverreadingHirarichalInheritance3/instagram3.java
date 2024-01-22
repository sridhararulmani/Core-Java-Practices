package inheritanceMethodOverreadingHirarichalInheritance3;

public class instagram3 extends instagram2{
	@Override
	void upload() {
		super.upload();
		System.out.println("Version 3 you can upload vedio also using this update in 60 sec");
	}
	@Override
	void dm() {
		super.dm();
		System.out.println("Version 3 you can sent direct message by senting image also using this update");
	}
	void reals() {
		System.out.println("version 3 you can put reals also using this update");
	}
}
