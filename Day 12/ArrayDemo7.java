public class ArrayDemo7 {
    public static void main(String[] args) {
        int a[]={7,1,5,3,6,4};
        int profit=0;
        int min=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(min>a[i])
            {
                min=a[i];
            }
            profit=Math.max(profit, a[i]-min);
        }
        System.out.println(profit);
    }
}
