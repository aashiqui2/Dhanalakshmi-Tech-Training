package methodOverloading;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		StringBuilder sb=new StringBuilder();
		int i=0;
		for(i=0;i<s1.length() && i<s2.length();i++)
		{
			sb.append(s1.charAt(i));
			sb.append(s2.charAt(i));
		}
		while(i<s1.length())
		{
			sb.append(s1.charAt(i));
			i++;
		}
		while(i<s2.length())
		{
			sb.append(s2.charAt(i));
			i++;
		}
		System.out.println(sb);
	}

}
