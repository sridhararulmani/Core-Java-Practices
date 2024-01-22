package interfaceProgram2;

public class john extends amazon implements jSpaider,qSpaider{
	@Override
	public void developApp() {
		System.out.println("John Learns Developing");
	}
	@Override
	public void testingApp() {
		System.out.println("John Learns Testing");
	}
	@Override
	void work() {
		super.work();
		System.out.println("John Got Job in Amazon");
	} 
	public static void main(String[] args) {
		john j=new john();
		j.developApp();
		j.testingApp();
		j.work();
	}
}