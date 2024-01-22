package sortingExample;

public class Person implements Comparable<Person>{
	int age;
	Person(int age){
		this.age=age;
	}
	@Override
	public String toString() {
		return "Age :"+age;
	}
	@Override
	public int compareTo(Person p) {
		return this.age-p.age; // return p.age-this.age;
	}
}