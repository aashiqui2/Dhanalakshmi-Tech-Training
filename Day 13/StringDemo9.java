public class StringDemo9 {
    public static void main(String[] args) {
        String s="b13c10";
        String str="";
        int i=0;
        while(i<s.length()){
            char c=s.charAt(i);//b
            if(Character.isLetter(c))//b
            {
                i++;//1
                int count=0;
                while(i<s.length() && Character.isDigit(s.charAt(i)))
                {
                    count=count*10+(s.charAt(i)-'0');
                    i++;
                }
                for(int k=0;k<count;k++)
                {
                    str+=c;
                }
            }
        }
        System.out.println(str);
    }
}
