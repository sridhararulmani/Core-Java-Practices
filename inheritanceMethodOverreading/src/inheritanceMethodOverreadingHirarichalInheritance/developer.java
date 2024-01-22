package inheritanceMethodOverreadingHirarichalInheritance;

public class developer extends employee{
	@Override
	void work() {
		super.work();
		System.out.println("Developer will Develop the App");
	}
}
