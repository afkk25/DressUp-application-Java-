
/* This is the main for Deliverable 4
 * Team Members:
   Afaf Bentakhou
   Haytham Ziani
   Younes Rahati
 */

package aui.project;
import Clothes.*;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Deliverable4 {

    public static ClothCollection dresscoll;
    public static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {  
        dresscoll = new ClothCollection();

        int choice;
        do{
            System.out.println("\n*****Menu*****");
            System.out.println("\n0. Load the Collection");
            System.out.println("\n1. Print the Collection");
            System.out.println("\n2. Add an Item");
            System.out.println("\n3. Remove an Item");
            System.out.println("\n4. Sort the Collection");
            System.out.println("\n5. Search by price and Category");
            System.out.println("\n6. Modify an element");
            System.out.println("\n7. Save the new collection to the file");
            System.out.println("\n8. Quit");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice){
                case 0:
                    try {
                        dresscoll.load();
                        System.out.println("Data loaded successfully");
                        System.out.println("\n"+dresscoll.toString());
                    } catch (Exception ex) {
                        System.err.println("Error loading the data");
                        ex.printStackTrace();
                    }
                    break;
                    
                case 1:
                    System.out.println(dresscoll.toString());
                    break;
                    
                case 2:
                    if(Add()){
                        System.out.println("Add successful");
                        System.out.println(dresscoll.toString());
                    }else
                        System.out.println("Add Unsuccessful");
                    break;
                    
                case 3:
                    if(Remove()){
                        System.out.println("Remove successful\n");
                        System.out.println(dresscoll.toString());
                    }else
                        System.out.println("Remove Unsuccessful");
                    break;
                    
                case 4:
                    Sort();
                    System.out.println(dresscoll.toString());
                    break;
                    
                case 5:
                    Search();
                    break;
                    
                case 6:
                    if(Modify()){
                        System.out.println("Modified Successfully\n");
                        System.out.println(dresscoll.toString());
                    }else
                        System.out.println("Modify Unsuccessful: Item not found.");
                        
                    break;
                    
                case 7:
                    try{
                        dresscoll.save();
                        System.out.println("Successfully saved");
                    }catch(Exception ex){
                        System.err.println("Error in saving your Data");
                    }
                    break;
                    
                case 8:
                    System.out.println("You decided to quit. Thank you!");
                    break;
                    
                default:
                    System.out.println("Wrong choice. Please enter a valid choice!");
                    break;
            }
        }while(choice != 8);
    }
    
    

    
    public static boolean Add(){
        int choice = 2;
        do {
            System.out.println("Would you like to add a Work Uniform? (1 for yes, 0 for no)");
            choice = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            if(choice != 1 && choice != 0)
                System.out.println("Please enter a valid option.");
        }while (choice != 1 && choice != 0);
        
        
        System.out.println("Title of your item: ");
        String Title = sc.nextLine();
        System.out.println("Description of your item: ");
        String description = sc.nextLine();
        System.out.println("Price of your item: ");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Category of your item: ");
        String catStr = sc.nextLine();
        
        Cloth item;
        if(choice == 1){
            System.out.println("What is the job related to this uniform?");
            String job = sc.nextLine();
            item = new WorkUniform(job, Title, description, price, catStr);
            
        }else
            item = new Cloth(Title, description, price, catStr);
        
   
     return(dresscoll.addCloth(item));  
    }

    public static boolean Remove(){
        System.out.println("Title of the item you want to remove: ");
        String title = sc.nextLine();
         
        return(dresscoll.removeCloth(title));
    }

    public static void Sort(){
        dresscoll.sortClothes();
    }

    public static void Search(){
        System.out.println("Price of Items to be displayed: ");
        double price = sc.nextDouble();
        sc.nextLine(); // Consume the newline character
        System.out.println("Category of Items to be displayed: ");
        String catStr = sc.nextLine();
        List<Cloth> toDisplay;
        Category cat = Category.valueOf(catStr.toUpperCase());
        try{
            toDisplay = dresscoll.searchCloth(price, cat);
            System.out.println(toDisplay.toString());
        }catch(CategoryNotFoundException ex){
            System.err.println(ex);
            if(ex.Recovery().isEmpty()) //there is no item with the given category
                System.out.println("No item in the given category");
            else
                System.out.println("The available prices:\n"+ ex.Recovery().toString());
        }
        
    }

    public static boolean Modify(){
        System.out.println("Title of the item to Modify: ");
        String toModify = sc.nextLine();

        System.out.println("Title of your new item: ");
        String Title = sc.nextLine();
        System.out.println("Description of your item: ");
        String description = sc.nextLine();
        System.out.println("Category of Items to be displayed: ");
        String catStr = sc.nextLine();
        System.out.println("Price of your item: ");
        double price = sc.nextDouble();
        
        Cloth item = new Cloth(Title, description, price, catStr);
        return (dresscoll.modifyCloth(toModify, item));
    }





}
