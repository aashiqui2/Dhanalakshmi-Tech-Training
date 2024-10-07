public class Demo {
    public static void main(String[] args) {
      //  String s="abc";
      //  for(int i=0;i<4;i++)
      //  {
      //     s=s+5;
      //  }
      //  System.out.println(s);

      //  StringBuffer str="new";//not valid
      StringBuffer str=new StringBuffer("abc");
      str.append("cdf");
      str.reverse();

       System.out.println(str);

       StringBuilder sb=new StringBuilder("abcdef");
       sb.repeat(sb, 3);
       System.out.println(sb);
    }
}