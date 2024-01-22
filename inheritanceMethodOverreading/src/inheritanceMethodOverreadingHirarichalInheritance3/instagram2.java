package inheritanceMethodOverreadingHirarichalInheritance3;

public class instagram2 extends instagram1{
	@Override
	void upload() {
		super.upload();
		System.out.println("Version 2 you can upload vedio also using this update in 30 sec");
	}
	void dm() {
		System.out.println("Version 2 you can sent direct message by test also using this update");
	}
}
