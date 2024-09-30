import java.util.*;
public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        int noOfDay = 0;
        String monthName = "";

        switch (month) {
            case 1:
                monthName = "Jan";
                noOfDay = 31;
                break;
            case 2:
                if (year % 4 == 0) {
                    if (year % 400 == 0 || year % 100 != 0) {
                        monthName = "Feb";
                        noOfDay = 29;
                    } else {
                        monthName = "Feb";
                        noOfDay = 28;
                    }
                }
                break;
        }
        System.out.println("The year " + year + " in the month of " + monthName + " has " + noOfDay + " days");
    }

}