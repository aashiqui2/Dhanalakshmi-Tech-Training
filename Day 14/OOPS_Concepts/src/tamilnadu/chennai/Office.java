package tamilnadu.chennai;
public class Office {
	public static void main(String[] args) {
		Office of=new Office();
		of.work();
		of.wfh();
		of.do_business_plan();
		of.recruitement();;
	}
	public void work()
	{
		System.out.println("Working in office");
	}
	void wfh()
	{
		System.out.println("Wfh");
	}
	private void  do_business_plan()
	{
		System.out.println("planning");
	}
	protected void recruitement()
	{
		System.out.println("start recruting");
	}

}
