public class Demo1 {
    public static void main(String[] args) {
        String s = "welcome";
        int n=7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j ||i+j==n+1) {
                    System.out.print(s.charAt(i - 1));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
