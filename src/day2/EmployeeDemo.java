package day2;

public class EmployeeDemo {
	public static void main(String[] args) {
		int m1=100;
		Employee e1=new Employee();
		Employee e2=new Employee();
		Employee e3=new Employee();
		
		e1.setEid(101);
		e1.setEname("iffat");
		e1.setCity("villupuram");
		
		e2.setEid(102);
		e2.setEname("yasmin");
		e2.setCity("villupuram");
		
		e3.setEid(101);
		e3.setEname("rafeem");
		e3.setCity("villupuram");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}
}
