package tamilnadu.chennai;

public class TCS {
	int amount;
	public TCS(int amount)
	{
		this.amount=amount;
	}
	public static void main(String[] args) {
		TCS customer1=new TCS(1000);
		customer1.bumpperOffer();
//		System.out.println(this.amount);
	}
	public void bumpperOffer()
	{
		System.out.println(this.amount);
	}

}
