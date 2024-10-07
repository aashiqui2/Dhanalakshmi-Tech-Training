package tamilnadu.chennai;

public class Employee {
	String name;
	int salary;
	public static void main(String[] args) {
		Employee emp1=new Employee();
		emp1.name="kumar";
		emp1.salary=20000;
		
		Office off=new Office();
		off.work();
		off.wfh();
		//off.do_business_plan();//private
		off.recruitement();
		System.out.println(emp1.name);
	}
}
