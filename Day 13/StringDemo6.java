public class StringDemo6 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    static int romanToInt(String s) {
        int total = 0;
        int i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            int v1 = value(c);// 1
            if (i + 1 < s.length()) {
                int v2 = value(s.charAt(i + 1));// 5
                if (v1 < v2) {
                    total -= v1;
                } else {
                    total += v1;
                }
            } else {
                total +=v1;
            }
            i++;
        }
        return total;
    }

    static int value(char c) {
        if (c == 'I') {
            return 1;
        } else if (c == 'V') {
            return 5;
        } else if (c == 'X') {
            return 10;
        } else if (c == 'L') {
            return 50;
        } else if (c == 'C') {
            return 100;
        } else if (c == 'D') {
            return 500;
        } else if (c == 'M') {
            return 1000;
        }
        return -1;
    }
}
/*
 * I 1
 * V 5
 * X 10
 * L 50
 * C 100
 * D 500
 * M 1000
 */
