public class Test1 {
	public static void main(String[] args) {
		int a[]= {4,1,2,1,2};
		int ans=0;
		for(int i=0;i<a.length;i++)
		{
			ans=ans^a[i];
		}
		System.out.println(ans);
	}
}
