public class StringDemo7 {

    public static void main(String[] args) {
        String s1 = "race";
        String s2 = "care";
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length() & i < s2.length(); i++) {
                char c = s1.charAt(i);
                int index = s2.indexOf(c);
                if (index != -1) {
                    s2 = s2.substring(0, index).substring(index);
                    // (0,2)-->ca + (3)-->e==>cae
                    // (0,1)-->c +(2)-->e==>ce
                    //(0,0)-->_+ (1)=>e
                }
            }
        }
        if (s2.isEmpty()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}