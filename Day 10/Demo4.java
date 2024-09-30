import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = findSum(n);
        while (sum > 9) {
            sum = findSum(sum);
        }
        System.out.println(sum);
    }

    static int findSum(int n) {
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        return sum;
    }
}
