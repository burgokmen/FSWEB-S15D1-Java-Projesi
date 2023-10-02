package groceryCart;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> glist = new LinkedList<>();
        goGroceryList(glist);
    }

    public static void goGroceryList(List<String> groceryList ) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Please enter the process!(0/1/2)");
                int process = scanner.nextInt();
                switch (process){
                    case 0:
                        System.exit(0);
                    case 1:
                        GroceryList.addItems(groceryList);
                        break;
                    case 2:
                        GroceryList.removeItems(groceryList);
                        break;
                    default:
                        System.out.println("Process must be 0-1-2");
                        break;
                }

            }catch (Exception ex) {
                System.out.println("Invalid process: " + ex.getMessage());
                break;
            }
        }
    }
}