package array1arrayPrograms;

public class solution {
	public static void main(String[] args) {
		student s1=new student(21,"sri");
		student s2=new student(22,"sri");
		student s3=new student(23,"sri");

		student[] s=new student[3];
		s[0]=s1;
		s[1]=s2;
		s[2]=s3;

		for(int i=0;i<=s.length-1;i++) {
			System.out.println("Age :"+s[i].age+"  Name :"+s[i].name);
		}
	}
}
