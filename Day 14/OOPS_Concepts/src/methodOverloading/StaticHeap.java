package methodOverloading;

public class StaticHeap {
	int num=20;
	public static void main(String[] args) {
		int data=10;
		int result=add(2,3);
		StaticHeap obj=new StaticHeap();
		StaticHeap obj1=new StaticHeap();
		System.out.println(result);
//		obj.num;
		System.out.println(obj.num);
		System.out.println(obj1.num);
	}
	static int add(int a,int b)
	{
		return a+b;
	}

}
