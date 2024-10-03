public class ArrayDemo3 {
    public static void main(String[] args) {
        int a[]={3,2,1,4,6};
        // 2,4,6,3,2,1
        int i=0,j=a.length-1;
        while(i<j)
        {
            while(i<j && a[i]%2==0)
            {
                i++;
            }
            while(i<j && a[j]%2!=0)
            {
                j--;
            }
            if(i<j)
            {
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                i++;
                j--;
            }
        }
       for(int k=0;k<a.length;k++){
        System.out.print(a[k]+" ");
       }
    }
}
