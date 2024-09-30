public class Fermat {
    static long modExp(long base, long power, long mod) {
        long result = 1;
        base = base % mod;
        while (power > 0) {
            //! if the power is odd need to multiply with base value
            if (power % 2 == 1) {
                result = (result * base) % mod;
            }
            power = power >> 1;
            base = (base * base) % mod;
        }
        return result;
    }

    static boolean isfermat(long a, long n) {
        if (modExp(a, n - 1, n) == 1) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        long a = 2, n = 5;
        if (isfermat(a, n)) {
            System.out.printf("Fermat's theorem holds: %d^(%d-1) ≡ 1 mod %d%n", a, n, n);
        } else {
            System.out.println("No");
        }
    }
}
