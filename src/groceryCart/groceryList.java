package groceryCart;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class groceryList {
    public static void addItems(String item,List<String> list ){
        if(!checkItemIsInList(item, list)){
            list.add(item);
            Collections.sort(list);
        } else System.out.println("Already added");

    }
    public static void removeItems(String item, List<String> list){
        if(checkItemIsInList(item, list)){
            list.remove(item);
            Collections.sort(list);
        } else System.out.println("Nothing to remove");
    }
    public static boolean checkItemIsInList(String item, List<String> list){

        for (String s : list) {
            if (item.equals(s)) {
                return true;
            }
        }
        return false;
    }
    public void printSorted(List<String> list){
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        List<String> grocerylist = new ArrayList<>();
        grocerylist.add("apple");
        System.out.println(checkItemIsInList("apple", grocerylist));
        addItems("banana", grocerylist);
        System.out.println(grocerylist);
        removeItems("hhh", grocerylist);
        addItems("banana", grocerylist);
        System.out.println(grocerylist);



    }
}
