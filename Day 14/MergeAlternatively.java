public class MergeAlternatively {
    public static void main(String[] args) {
        String s1="abc";
        String s2="def";
        StringBuilder sb=new StringBuilder();
        int i=0;
        for(i=0;i<s1.length() &&i< s2.length();i++)
        {
            sb.append(s1.charAt(i));
            sb.append(s2.charAt(i));
        }
        while(i<s1.length())
        {
            sb.append(s1.charAt(i));
        }
        while(i<s2.length())
        {
            sb.append(s2.charAt(i));
        }
        System.out.println(sb);
    }
}
