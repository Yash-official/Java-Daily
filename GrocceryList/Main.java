import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    private static GrocceryList grocceryList=new GrocceryList();
    public static void main(String[] args) {
        int choice=0;
        boolean quit=false;
        while(!quit){
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 0:printInstructions();break;
                case 1:grocceryList.printGroceryList();break;
                case 2:addItem();break;
                case 3:removeItem();break;
                case 4:findItem();break;
                case 5:modifyGrocerylist();break;
                case 6:quit=true;
                    System.out.println("Come back Soon");break;
            }
        }
    }
    public static void printInstructions(){
        System.out.println("Press :");
        System.out.println("0 to Print Instruction");
        System.out.println("1 to print all the Items in the GroceryList");
        System.out.println("2 to add items to the list");
        System.out.println("3 to remove item from the list");
        System.out.println("4 to find item in the list");
        System.out.println("5 to modify item in the list");
        System.out.println("6 to quit from the program");
    }
    public static void addItem(){
        System.out.print("Enter the Item to add to the list: ");
        String s=sc.nextLine();
        grocceryList.addGrocerItem(s);
    }
    public static void removeItem(){
        System.out.print("Enter the Item number to remove");
        int item= sc.nextInt();
        grocceryList.removeGroceryItem(item-1);
    }
    public static void findItem(){
        System.out.print("Enter the Item to find in the list: ");
        String s=sc.nextLine();
        if(grocceryList.findItem(s)!=null){
            System.out.println("The item "+s+" found in the list");
        }else {
            System.out.println("The item" + s + " not found in the list");
        }
    }
    public static void modifyGrocerylist(){
        System.out.print("Enter the Item name to modify in the list: ");
        String s=sc.nextLine();
        System.out.print("Enter the new Item to insert in the list: ");
        String newItem=sc.nextLine();
        grocceryList.modifyGroceryList(s,newItem);
    }
}
