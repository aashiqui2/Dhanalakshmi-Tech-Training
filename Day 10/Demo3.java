public class Demo3 {
    public static void main(String[] args) {
        int n = 561;
        // isprime(n);
        primeRange(1, 20);
    }

    static void isprime(int n) {
        int div = 2;
        boolean flag = true;
        while (div <= n / 2) {
            if (n % div == 0) {
                flag = false;
                break;
            }
            div++;
        }
        if (flag == true) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }

    static void primeRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            int div = 2;
            boolean flag = true;
            while (div <= i / 2) {
                if (i % div == 0) {
                    flag = false;
                    break;
                }
                div++;
            }
            if (flag == true) {
                System.out.print(i + " ");
            }
        }
    }

}