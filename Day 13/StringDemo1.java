public class StringDemo1 {
    public static void main(String[] args) {
        String s1 = new String("ABC");// Heap
        String s2 = new String("ABC");// Heap
        // String s2 = "ABC";//SCP
        // if(s1==s2)
        // {
        // System.out.println("s1 s2 are ==");
        // }
        // else
        // {
        // System.out.println("s1 s2 are not ==");
        // }
        if (s1.equals(s2)) {
            System.out.println("s1 s2 are ==");
        } else {
            System.out.println("s1 s2 are not ==");
        }

        // String s1="abc";//scp
        // String s2="abc";
        // if(s1==s2)
        // {
        // System.out.println("s1 s2 are ==");
        // }
        // else
        // {
        // System.out.println("s1 s2 are not ==");
        // }

    }
}
