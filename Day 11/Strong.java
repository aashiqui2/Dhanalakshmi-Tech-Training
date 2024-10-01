public class Strong {
    public static void main(String[] args) {
        int n=145;
        strong(n);
    }
    static void strong(int n)
    {
        int temp=n;
        int sum=0;
        while(temp!=0)
        {
            int rem=temp%10;
            sum=sum+fact(rem);
            temp/=10;
        }
        if(n==sum){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a strong");
        }
    }
    static int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
       return  n* fact(n-1);
    }
}
