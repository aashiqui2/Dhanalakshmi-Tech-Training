public class Demo2 {
    public static void main(String[] args) {
        String s="Abz";
        int n=3;
        char c[]=s.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i]>='a' &&c[i]<='z')
            {
                if(c[i]+n>122)
                {
                    c[i]+=n-26;
                }
                else{
                    c[i]+=n;
                }
            }
            if(c[i]>='A' &&c[i]<='Z')
            {
                if(c[i]+n>90)
                {
                    c[i]+=n-26;
                }
                else{
                    c[i]+=n;
                }
            }
        }
        String str=new String(c);
        System.out.println(str);
    }
}
