public class ArrayDemo2 {
    public static void main(String[] args) {
        //       0 1 2 3 4
        int[] a={1,2,3,4,5};

        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(i%2!=0)
            {
                sum=sum+a[i];
            }
        }
        System.out.println(sum);
    }
}
