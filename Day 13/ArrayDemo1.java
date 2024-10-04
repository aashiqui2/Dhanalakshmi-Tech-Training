public class ArrayDemo1 {
    public static void main(String[] args) {
        // int a[]={-1,2,-3,3};
        int a[]={-1,10,6,7,-7,1};
        int largest=-1;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==-a[j])
                {
                    largest=a[i];
                }
            }
            largest=Math.max(largest, Math.abs(a[i]));
        }
        System.out.println(largest);
    }
}
