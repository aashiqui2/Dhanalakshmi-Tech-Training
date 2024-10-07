package tamilnadu.trichy;
import tamilnadu.chennai.Office;

public class Employee1 {
	String name;
	int salary;

	public static void main(String[] args) {
		Employee1 emp=new Employee1();
		emp.name="ashok";
		emp.salary=100000;
		
		Office off=new Office();
		off.work();
		//off.wfh();//package private method cannot be
		// accessed.
//		off.recruitement();
		System.out.println(emp.name);
	}

}
