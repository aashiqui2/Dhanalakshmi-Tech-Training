public class ArrayDemo5 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int l[]=new int[a.length];
        int r[]=new int[a.length];
        l[0]=1;
        r[a.length-1]=1;
        for(int i=1;i<a.length;i++)
        {
            l[i]=a[i-1]*l[i-1];
        }
        for(int i=a.length-2;i>=0;i--)
        {
            r[i]=a[i+1]*r[i+1];
        }
        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            c[i]=l[i]*r[i];
        }
        for(int i: c)
        {
            System.out.print(i+ " ");
        }
    }
}
