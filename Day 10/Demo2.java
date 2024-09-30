import java.util.*;

public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // find_common_divisor(a, b);

        // prime_factor(29);
        // reversedigit(123);
        sqrtBinary(16);
    } 
    static void sqrtBinary(int n)
    {
        int low=0,high=n;
        while(high-low>0)
        {
            int mid=(low+high)/2;
            int mids=mid*mid;
            if(mids==n)
            {
                System.out.println(mid);
                break;
            }
            else if(mids<n)
            {
                low=mid;
            }
            else {
                high=mid;
            }
        }
    }














    static void reversedigit(int n)
    {
        int temp=n;
        int sum=0;
        while(temp!=0)
        {
            int rem=temp%10;
            sum=sum*10+rem;
            temp=temp/10;
        }
        System.out.println(sum);
    }










    static void prime_factor(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }
        for (int i = 3; i <n/2; i = i + 2) {
            if (n % i == 0) {
                System.out.print(i + " ");
                n=n/i;
            }
        }
        if(n>2)
        {
            System.out.println(n+" ");
        }
    }

    static void find_common_divisor(int n1, int n2) {
        int min = (n1 < n2) ? n1 : n2;
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
