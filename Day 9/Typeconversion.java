public class Typeconversion {
    public static void main(String[] args) {
        byte a = 128;
        int b = a;
        a = (byte) b;
        System.out.println(a);
        System.out.println(b);

        int a=129;
        byte b=(byte)a;
        System.out.println(b);

        byte a = 127;
        int b = 128;
        a = (byte) b;
        System.out.println(a);

        float f = 5.6f;
        int a = (int) f;
        System.out.println(a);

        char c='c';
        int a=c;
        System.out.println(a);

        int a=99;
        char c=(char)a;
        System.out.println(c);
    }
}
