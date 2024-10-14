package tamilnadu.chennai;

public class SuperMarket {
	int price;
	int dicount;
	String name;
	int capacity;
	static {
		System.out.println("hi i am static");
	}
	public SuperMarket()
	{
		System.out.println("No -argument constructor");
	}
	public SuperMarket(String name,int price,int dicount)
	{
		this.name=name;
		this.price=price;
		this.dicount=dicount;
	}
	public SuperMarket(String name,int price,int dicount,int capcity)
	{
		this.name=name;
		this.price=price;
		this.dicount=dicount;
		this.capacity=capcity;
	}
	{
		System.out.println("hi i am non static");
	}
	public static void main(String[] args) {
		SuperMarket prod1=new SuperMarket();
		prod1.name="biscuits";
		prod1.price=10;
		prod1.dicount=2;
		SuperMarket prod2=new SuperMarket();
		prod2.name="icecream";
		prod2.price=25;
		prod2.dicount=10;
		SuperMarket prod3=new SuperMarket("biscuits",10,2);
		System.out.println(prod3.name);
		System.out.println(prod3.price);
		System.out.println(prod3.dicount);
		SuperMarket prod4=new SuperMarket("rice",450,10,2);
		System.out.println(prod4.capacity);
		SuperMarket prod5=new SuperMarket();
		System.out.println(prod5.name);
	}

}
