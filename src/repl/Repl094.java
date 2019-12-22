package repl;

import java.util.Scanner;

public class Repl094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        do{
            System.out.println("Enter item"+count+" and its price: ");
            item=scan.next();
            price =scan.nextDouble();
            totalPrice+=price;
            shoppingListReport += "Item"+count+": "+item+" Price: "+price+", ";



            System.out.println("Add on more item");
            countinue = scan.next();
            count++;
        }while (!countinue.equalsIgnoreCase("no")&&count <=10);


        System.out.println(shoppingListReport.substring(0,shoppingListReport.length()-2));
        System.out.println("Total price: "+totalPrice);
    }
}
