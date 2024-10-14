package tamilnadu.chennai;

public class MobileShop {
	public MobileShop()
	{
//		this();
		System.out.println("Welcome");
	}
	public MobileShop(String name,int amount,int discount)
	{
		this(amount,discount);
		System.out.println(name);
	}
	public MobileShop(int amount,int discount)
	{
		this();
		System.out.println(amount-discount);
	}

	public static void main(String[] args) {
		
		MobileShop samsung=new MobileShop("samsung",10000,200);
		
	}

}
