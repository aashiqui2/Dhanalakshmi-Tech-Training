public class StringDemo3 {
    public static void main(String[] args) {
        // 0123456789112345678
        String s = "hello boys listen the class.";
        // System.out.println(s.startsWith("class"));
        // System.out.println(s.startsWith("the",18));
        // System.out.println(s.endsWith("class."));
        System.out.println(s.contentEquals(s));

    }
}
