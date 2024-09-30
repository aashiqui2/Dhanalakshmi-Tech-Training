import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
        // float f=sc.nextFloat();
        // System.out.println(f);
        // sc.nextLine();
        String name=sc.nextLine();
        System.out.println(name);
    }
}
