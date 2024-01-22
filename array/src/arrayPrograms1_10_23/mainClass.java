package arrayPrograms1_10_23;

public class mainClass {
	public static void main(String[] args) {
		employee e1=new employee(01,"Tom",1.5);
		employee e2=new employee(02,"Jom",2.5);
		employee e3=new employee(03,"Bom",3.5);
		employee[] e=new employee[3];
		e[0]=e1;
		e[1]=e2;
		e[2]=e3;
		for(int i=0;i<=e.length-1;i++) {
			System.out.println("Emp ID "+e[i].id+" Name is "+e[i].name+" his salary is "+e[i].salary);
		}
	}
}