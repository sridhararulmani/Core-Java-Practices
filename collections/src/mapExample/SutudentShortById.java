package mapExample;

import java.util.Comparator;

import mapExamplePracticesIn15_11.Student;

public class SutudentShortById implements Comparator<Student>{
	@Override
	public int compare(Student s1,Student s2) {
		return s2.id-s1.id;
	}
}