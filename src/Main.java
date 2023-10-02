import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Please choose 0/1/2");

        int choosenPath = Integer.parseInt(myObj.nextLine());
        switch (choosenPath){
            case 0:
                System.out.println("App is closed");
                break;
            case 1:
                System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                String addedProducts = myObj.nextLine();
                break;
            case 2:
                System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                String removedProducts = myObj.nextLine();
                break;
        }


    }
}