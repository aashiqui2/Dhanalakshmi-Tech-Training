package methodOverloading;
public class Add {
	public static void main(String[] args) {
		int a=2;
		int b=3;
		Add ad=new Add();
		ad.add(a,b);
		ad.add(b, a, 4);
	}
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
