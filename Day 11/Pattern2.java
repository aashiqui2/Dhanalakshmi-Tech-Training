public class Pattern2 {
    public static void main(String[] args) {
        int n=7;
        pattern2(n);
    }
    static void pattern2(int n)
    {
        for(int i=1;i<2*n;i++){
            int totalcolms=(i>n)?2*n-i:i;
            for(int j=1;j<=totalcolms;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
