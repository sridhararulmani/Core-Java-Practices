package accessModifier;

public class student {
	public static int id=103;
	public String name="Tom";
	public void study() {
		System.out.println("Studenting study well");
	}
	public static void main(String[] args) {
		student s=new student();
		s.study();
		System.out.println("Student Id :"+student.id);
		System.out.println("Student Name :"+s.name);
	}
}
