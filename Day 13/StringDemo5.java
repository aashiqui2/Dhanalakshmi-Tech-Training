public class StringDemo5 {
    public static void main(String[] args) {
        String s="abcd";
        String str="";
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(i%2==0)
            {
                
                str+=(char)(c-32);
            }
            else{
                str+=c;
            }
        }
        System.out.println(str);
    }
}
