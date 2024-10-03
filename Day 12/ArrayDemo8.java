public class ArrayDemo8 {
    public static void main(String[] args) {
        int n=5;
        // [0,1,1,2,1,2]
        int countbit[]=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            countbit[i]=countbit[i>>1]+i%2;
        }
        for(int i:countbit)
        {
            System.out.print(i+" ");
        }
    }
}
