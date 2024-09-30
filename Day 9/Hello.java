
public class Hello {
    int a=40;
    public static void main(String[] args) {
        Hello a=new Hello();//object creation
        // a.add(2, 3);
        add(2,3);
        a.print();
    }

    static void add(int q, int w) {///parameter
        System.out.println(q + w);

    }
    void print()
    {
        System.out.println(a);
    }

}