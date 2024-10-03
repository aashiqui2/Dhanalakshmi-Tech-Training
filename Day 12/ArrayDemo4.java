public class ArrayDemo4 {
    public static void main(String[] args) {
        int a[] = { 3, 0, 4, 0, 0, 6 };
        int j=0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                j++;
            }
        }
        for(int i: a)
        {
            System.out.print(i+" ");
        }

    }
}
