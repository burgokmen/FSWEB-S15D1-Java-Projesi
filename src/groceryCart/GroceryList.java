package groceryCart;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GroceryList {

    private static String getInput(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void toggleItems(List<String> groceryList){
        System.out.println("Enter the item/s you want to add/remove!");
        String input = getInput().toLowerCase().trim();

        if (input.contains(",")) {
            String[] elements = input.split(",");
            for (String element : elements){
                addOrRemove(groceryList, element.trim());
            }
        } else {
            addOrRemove(groceryList, input);
        }
        printSorted(groceryList);
    }

    private static void addOrRemove(List<String> groceryList, String element) {
        if( element != null
                && !element.trim().isEmpty()){
            if(checkItemIsInList(groceryList, element)){
                groceryList.remove(element);

            } else groceryList.add(element);
        }
    }


    public static boolean checkItemIsInList( List<String> list, String item){

        for (String s : list) {
            if (item.trim().equals(s)) return true;
        }
        return false;
    }
    public static void printSorted(List<String> list){
        Collections.sort(list);
        System.out.println(list);
    }

}

  /* public static void addItems(List<String> list ){
        if(!checkItemIsInList(item, list)){
            list.add(item);
            Collections.sort(list);
        } else System.out.println("Already added");

    }
    public static void removeItems(List<String> list){
        if(checkItemIsInList(item, list)){
            list.remove(item);
            Collections.sort(list);
        } else System.out.println("Nothing to remove");
    }*/