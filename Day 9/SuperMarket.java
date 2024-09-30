public class SuperMarket {
    static String name = "Reliance Mall";
    int price;
    int dicount;
    String prodname;

    public static void main(String[] args) {
        SuperMarket product1 = new SuperMarket();
        product1.prodname = "Biscuits";
        product1.price = 10;
        product1.dicount=2;
        SuperMarket product2 = new SuperMarket();
        product2.prodname="Shampoo";
        product2.price=150;
        product2.dicount=30;
        System.out.println(product1.prodname);
        System.out.println(product2.prodname);
        System.out.println(name);
    }
}
