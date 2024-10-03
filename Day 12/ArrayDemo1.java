public class ArrayDemo1 {
    public static void main(String[] args) {
        int a[]={1,2,3,};
        int[] b={1,2,3,4,5};
        int max=a.length>b.length?a.length:b.length;
        int min=a.length<b.length?a.length:b.length;
        int[] c=new int[max];
        for(int i=0;i<min;i++)
        {
            c[i]=a[i]*b[i];
        }
        for(int i=min;i<max;i++)
        {
            if(a.length>b.length)
            {
                c[i]=a[i];
            }
            else if(b.length>a.length){
                c[i]=b[i];
            }
        }
        for(int i: c)
        {
            System.out.print(i+" ");
        }
    }
}
