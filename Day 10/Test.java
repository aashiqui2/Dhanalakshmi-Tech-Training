public class Test {
    static void printA() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 && i != 0 || j == 4 && i != 0 || i == 3 || i == 0 && j != 0 && j != 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printB() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0 || j == 4 && i != 0 && i != 3 && i != 6 || i == 0 && j != 4 || i == 3 && j != 4 || i == 6
                        && j != 4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void printc() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || j == 0 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    static void printd() {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 5; j++) {
                if (j == 0  || j == 4 && i != 0 && i != 6||i==0 &&j!=4||i==6&j!=4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        // printA();
        // printB();
        // printc();
        printd();

    }

}