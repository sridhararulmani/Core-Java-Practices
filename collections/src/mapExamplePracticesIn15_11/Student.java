package mapExamplePracticesIn15_11;

public class Student {
	public int id;
	public int age;
	public String name;
	public Student(int id, int age,String name){
		this.id=id;
		this.age=age;
		this.name=name;
	}
	@Override
	public String toString() {
		return "Age :"+age+" Name :"+name+" ID :"+id;
	}
}