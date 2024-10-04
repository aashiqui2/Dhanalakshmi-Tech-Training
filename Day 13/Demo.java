public class Demo {

    public static void main(String[] args) {
        String s="Hi My Name is Hello";
        // String str[]=s.split(" ");
        // StringBuilder sb=new StringBuilder();
        // for(int i=str.length-1;i>=0;i--)
        // {
        //     sb.append(str[i]).append(" ");
        // }
        // System.out.println(sb.toString());
        int end=s.length();
        String r="";
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)==' ')
            {
                r+=s.substring(i+1,end)+" ";
                end=i;
            }
        }
        r+=s.substring(0,end);
        System.out.println(r);   
    }
}