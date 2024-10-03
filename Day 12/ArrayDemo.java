import java.util.Scanner;
public class ArrayDemo {
    public static void main(String[] args) {
        // int a[]={1,2,3,4,5};
        // int len=a.length;
        // System.out.println(len);
        // System.out.println(a);
        // // for(int i=0;i<len;i++)
        // // {
        // // System.out.print(a[i]+" ");
        // // }

        // for(int i:a)
        // {
        // System.out.print(i);
        // }

        int[] a = new int[4];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        for(int i:a)
        {
            System.out.print(i+" ");
        }

    }
}
