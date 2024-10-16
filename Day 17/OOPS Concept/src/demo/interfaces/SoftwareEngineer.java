package demo.interfaces;

public class SoftwareEngineer extends Parent implements OfficeRules,TrafficeRules{
	SoftwareEngineer()
	{
		System.out.println("i am from SoftwareEngineer");
	}
	public static void main(String[] args) {
		SoftwareEngineer se=new SoftwareEngineer();
		se.watching_tv();
		OfficeRules or=new SoftwareEngineer();
		or.wear_formal();
//		or.go_slow();
		TrafficeRules tf=new SoftwareEngineer();
		tf.go_left();
//		dynamic binding
	}
	void work()
	{
		System.out.println("working");
	}
//  Cannot reduce the visibility of the inherited method from TrafficeRules
	public  void go_slow() {
		System.out.println("go_slow");
		
	}
	
	public void go_left() {
		System.out.println("go_left");
		
	}
	public void work_8_hours() {
		System.out.println("work_8_hours");
		
	}
	public void wear_formal() {
		System.out.println("wear_formals");
		
	}

}
