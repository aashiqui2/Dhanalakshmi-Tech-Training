public class Demo1 {
    public static void main(String[] args) {
        String s = "abcde";
        String goal = "cdetb";
        boolean flag = false;
        if (s.length() != goal.length()) {
            flag = false;
        } else {
            s = s + s;
            if (s.contains(goal)) {
                flag=true;
            }
        }
        if (flag) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }
}
