package inheritanceMethodOverreadingHirarichalInheritance;

public class tester extends developer{
	@Override
	void work() {
		super.work();
		System.out.println("Tester will Test the app");
	}
}