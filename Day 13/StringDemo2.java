public class StringDemo2 {
    public static void main(String[] args) {
        String s=new String("ABC");
        String s1=new String("abc");
        // System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.compareTo(s1));
        //return postive is s> s1.
        //return negative s<s1.
        //return zero is s==s1
        System.out.println(s.compareToIgnoreCase(s1));
    }
}
