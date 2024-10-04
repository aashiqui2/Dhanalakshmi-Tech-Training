public class StringDemo8 {
    public static void main(String[] args) {
        String s="a quick brown fox jumps over the lazy dog";
        char str[]=s.toCharArray();
        int alpha[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            if(str[i]!=' ')
            {
                alpha[str[i]-'a']++;
            }
        }
        boolean ispanagram=true;
        for(int i=0;i<26;i++)
        {
            if(alpha[i]==0)
            {
                System.out.println("Not a panagram");
                ispanagram=false;
                break;
            }

        }
        if(ispanagram)
        {
            System.out.println("Panagram");
        }
    }
}