import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);
    
    Drink regular = new Drink(); 
    MilkTea plainMilkTea = new MilkTea();
    IceTea plainIceTea = new IceTea();


    
    System.out.println("Welcome to the drink shop! What would you like? \nType 1 for Milk Tea \nType 2 for Ice Tea \nType 3 for Other");
    int choice = input.nextInt();

    System.out.println("\n---------- New drink is being created ----------");
    
    if (choice == 1) {

    System.out.println("\nWould you like to create your own or have the original? \nfalse for plain \ntrue for custom");
    boolean newChoice = input.nextBoolean();
      if (newChoice == false){
        
        System.out.println("\n---------- Your Final Order ----------");
      
        System.out.println("\n" + plainMilkTea);
        
      } else {
        
    System.out.println("\nWhat flavor of Milk Tea would you like?");
    String newFlavor = input.next();
    plainMilkTea.setFlavor(newFlavor);
    
    System.out.println("What size would you like?");
    String newSize = input.next();
    plainMilkTea.setSize(newSize);
    
    System.out.println("Will there be boba in it?");
    boolean newHasBoba = input.nextBoolean();
    plainMilkTea.setHasBoba(newHasBoba);

    System.out.println("If so, what type of boba?");
    String newTypeOfBoba = input.next();
    plainMilkTea.setTypeOfBoba(newTypeOfBoba);

    System.out.println("What type of milk would you like?");
    String newTypeOfMilk = input.next();
    plainMilkTea.setTypeOfMilk(newTypeOfMilk);

    System.out.println("Will this be blended?");
    boolean newIsBlended = input.nextBoolean();
    plainMilkTea.setIsBlended(newIsBlended);

    System.out.println("\n---------- Your Final Order ----------");
      
    System.out.println("\n" + plainMilkTea);
        
      }
      
    } else if (choice == 2) {

      System.out.println("\nWould you like to create your own or have the original? \nfalse for plain \ntrue for custom");
    boolean newChoice = input.nextBoolean();
      if (newChoice == false){
        
        System.out.println("\n---------- Your Final Order ----------");
      
        System.out.println("\n" + plainIceTea);
        
      } else {
        
    System.out.println("\nWhat flavor of Ice Tea would you like?");
    String newFlavor = input.next();
    plainIceTea.setFlavor(newFlavor);
    
    System.out.println("What size would you like?");
    String newSize = input.next();
    plainIceTea.setSize(newSize);
    
    System.out.println("Will there be boba in it?");
    boolean newHasBoba = input.nextBoolean();
    plainIceTea.setHasBoba(newHasBoba);

    System.out.println("If so, what type of boba?");
    String newTypeOfBoba = input.next();
    plainIceTea.setTypeOfBoba(newTypeOfBoba);

    System.out.println("Will you add extra honey?");
    boolean newHasExtraHoney = input.nextBoolean();
    plainIceTea.setHasExtraHoney(newHasExtraHoney);

    System.out.println("Will this have lemon?");
    boolean newHasLemon = input.nextBoolean();
    plainIceTea.setHasLemon(newHasLemon);

    System.out.println("\n---------- Your Final Order ----------");
      
    System.out.println("\n" + plainIceTea);
      }
      
    } else {

      System.out.println("\nWould you like to create your own or have the original? \nfalse for plain \ntrue for custom");
    boolean newChoice = input.nextBoolean();
      if (newChoice == false){
        
        System.out.println("\n---------- Your Final Order ----------");
      
        System.out.println("\n" + regular);
        
      } else {
    System.out.println("\nWhat flavor of Drink would you like?");
    String newFlavor = input.next();
    regular.setFlavor(newFlavor);
    
    System.out.println("What size would you like?");
    String newSize = input.next();
    regular.setSize(newSize);
    
    System.out.println("Will there be boba in it?");
    boolean newHasBoba = input.nextBoolean();
    regular.setHasBoba(newHasBoba);

    System.out.println("If so, what type of boba?");
    String newTypeOfBoba = input.next();
    regular.setTypeOfBoba(newTypeOfBoba);

    System.out.println("\n---------- Your Final Order ----------");
    
    System.out.println("\n" + regular);
      }
    }
    
    System.out.println("\nThank you!");


    // Closes the Scanner object
    input.close();
    
  }
}