public class StringDemo4 {
    public static void main(String[] args) {
        String s = "education";
        int VowelsCount = 0, ConsonentCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (isVowels(c)) {
                VowelsCount++;
            } else {
                ConsonentCount++;
            }
        }
        System.out.println("The VowelCount is " + VowelsCount);
        System.out.println("The ConsonentCount is " + ConsonentCount);
    }

    static boolean isVowels(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
