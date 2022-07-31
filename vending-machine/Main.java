import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("\t************************************************");
        System.out.println("\t             WELCOME TO JAVA DRINKS!            ");
        System.out.println("\t************************************************");
        

        // Create the object

        //Item item = new Item("Pepsi", 3.99, 3);
        //System.out.println(item);
         Item[][] items = new Item[][] {
             { new Item("Pepsi", 1.99, 3) , new Item("Fresca", 1.49, 3), new Item("Brisk", 2.49, 2) },
             { new Item("Fanta", 1.99, 2) , new Item("Barq's", 1.49, 2), new Item("A & W", 2.49, 3) },
           { new Item("Crush", 1.99, 2) , new Item("C-Cola", 1.49, 2), new Item("Berry", 2.49, 1) }
         };
         Machine machine = new Machine(items);
         //System.out.println(machine);
         Scanner scan = new Scanner(System.in);
         System.out.println("Pick a row: ");
         int row = scan.nextInt();
         System.out.println("Pick a Spot in the row: ");
         int spot = scan.nextInt();

         machine.dispense(row, spot);
         System.out.println("\n"+machine);

    }
}
