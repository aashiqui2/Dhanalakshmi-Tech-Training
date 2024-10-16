package tamilnadu.coimbatore;

public class Laptop extends Desktop{
	public Laptop(){
		super();
		System.out.println("charge");
	}
	public Laptop(int amount ,int discount)
	{
		super(amount,discount);
	}

	public static void main(String[] args) {
		
		Laptop l=new Laptop();
		Laptop l1=new Laptop(50000,10000);
	}

}
