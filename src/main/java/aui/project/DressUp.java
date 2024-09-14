package aui.project;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import Orders.PayInfos.*;
import java.util.Date;
import User.Account;
import User.Profile;
import Clothes.*;
import Orders.ShippingInfos.*;


/**
 *
 * @author DELL
 */
public class DressUp {
  public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int i;
        do{
        
            Cloth[] cloth_array = new Cloth[4];
            System.out.println("\n*****Menu*****");
            System.out.println("\n1. Create Account");
            System.out.println("\n2. Create Profile with Shipping information");
            System.out.println("\n3. Create Cloth List and process it");
            System.out.println("\n4. Fill payment information");
            System.out.println("\n5. Quit");
            i = sc.nextInt();
            sc.nextLine();
            
        
         switch(i){
             
            case 1://Creating an Account Object
                CreateAcc();
                break;
                
                
            case 2: //Creating a Profile and an Address Objects, and a Shipping Object
                CreateProfileAddShipp();
                break;
                
             
            case 3: //Creating a cloth list and process it
                cloth_array = CreateCloth();
                System.out.println("Your list has been created: ");
                Processclothes(cloth_array);
                break;
                
                
            case 4: //Creating payment object
                CreatePayInfos();
                break;
            
              
            case 5:
                System.out.println("You decided to quit. Thank you!!");
                break;
            
            default:
                System.out.println("Wrong choice;");
                break;
        }   
           
        } while (i !=5);

        
      
     
    }
    
    public static void Processclothes(Cloth[] cloth_array) {
        System.out.println("Here are The item Informations");
        for (Cloth cloth_item : cloth_array) {
            System.out.println(cloth_item.toString());
            if (cloth_item instanceof WorkUniform) {
                WorkUniform he = (WorkUniform) cloth_item;
                he.setDirt_lvl(4);
                System.out.println("Dirt Level: "+he.getDirt_lvl());
            }
            
            System.out.println("*******************************");
        }
    }
    
    public static void CreateAcc(){
        System.out.println("Welcome! Please enter your email:");
        String email = sc.nextLine();

        System.out.println("Your Password:");
        String password = sc.nextLine();

        Account acc = new Account(email, password);  
        System.out.println("Here are your account information.\nPlease note that the passwords can't be printed for security reasons!");
        System.out.println(acc.toString());

        System.out.println("********************************************");
    }
    
    public static Cloth[] CreateCloth(){
      
        Cloth Item1 = new Cloth("Sweater", "Comfortable Sweater", 49.99, Size.SMALL, Category.SWEATER, Color.BLACK);        
        Cloth Item2 = new Cloth("Suit", "Warm Shirt", 149.99, Size.MEDIUM, Category.SUIT, Color.BLUE);
        Cloth Item3 = new WorkUniform("Mechanic", "Trousers for a mechanic", "Used mechanic trousers in fair conditions", 9.85, Size.LARGE, Category.TROUSERS, Color.BLUE);
        Cloth Item4 = new WorkUniform("Carpenter", "apron", "Used carpenter apron", 19.99, Size.SMALL, Category.DRESS, Color.WHITE);
        Cloth[] cloth_array = new Cloth[4];
        cloth_array[0] = Item1;
        cloth_array[1] = Item2;
        cloth_array[2] = Item3;
        cloth_array[3] = Item4;
        
        return cloth_array;
    }
    
    public static void CreateProfileAddShipp(){
        System.out.println("We need your Profile Information: ");
        System.out.println("Please enter your name: ");
        String name = sc.nextLine();
        System.out.println("Please enter your phone number: ");
        String phone = sc.nextLine();

        System.out.println("Please enter your address information next.");
        System.out.println("Street Number: ");
        int street_number = sc.nextInt();
        sc.nextLine();
        System.out.println("Street: ");
        String street = sc.nextLine();  
        System.out.println("City: ");
        String city = sc.nextLine(); 
        System.out.println("Country: ");
        String country = sc.nextLine(); 
        System.out.println("Zip code: ");
        int zipCode = sc.nextInt(); 
        Address add = new Address(street_number, street, city, country, zipCode);

        Profile prof = new Profile(name, add, phone);
        System.out.println("Here are your profile Information:");
        System.out.println(prof.toString());

        System.out.println("********************************************");
        Shipping ShipInfo = new Shipping(name, phone, add);
        System.out.println("Here are The Shipping Informations");
        System.out.println(ShipInfo.toString());

        System.out.println("********************************************");

    }
    
    public static void CreatePayInfos(){
        System.out.println("\nWe need your Payment Information: ");
        System.out.println("\nPlease enter cardholer name: ");
        String holder_name = sc.nextLine();
        System.out.println("Please enter card expiration date number (yyyy-MM): ");

        System.out.print("Enter a date (yyyy-MM): ");
        String userInput = sc.next();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM");
        GregorianCalendar expiration_date = new GregorianCalendar();

        try {
            Date parsedDate = dateFormat.parse(userInput);
            expiration_date.setTime(parsedDate);

            System.out.println("Parsed year: " + expiration_date.get(GregorianCalendar.YEAR));
            System.out.println("Parsed month: " + (expiration_date.get(GregorianCalendar.MONTH) + 1)); // Month is zero-based

        } catch (ParseException e) {
            System.out.println("Invalid date format. Please enter the date in yyyy-MM format.");
            return;
        }


        System.out.print("Enter your card type (visa/mastercard/americanexpress): ");
        String input_user = sc.next().toUpperCase();
        sc.nextLine();

        Type cardType = null; 

        try {
            cardType = Type.valueOf(input_user);
            System.out.println("You selected: " + cardType);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid card type. Please enter a valid card type.");
            return;
        }


        System.out.println("Please enter your card number: ");

        int number = 0;
        try {
            String cardNumberInput = sc.next();
            number = Integer.parseInt(cardNumberInput);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for card number. Please enter a valid integer.");
            return;
        }
        
        PaymentInformation payInfo = new PaymentInformation(holder_name, expiration_date, cardType, number);
        System.out.println("Here are The payment Informations");
        System.out.println(payInfo.toString());        
    }
   
}
