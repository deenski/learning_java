import java.util.*;
public class testMachine {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        VendingMachine jake = new VendingMachine();
        
        Item lays = new Item("Lays Potato Chips", 3, 6);
        Item sunChips = new Item("Sun Chips", 3, 6);
        Item pepsi = new Item("Pepsi Cola", 2, 6);
        Item mug = new Item("Mug Root Beer", 2, 6);
        Item skittles = new Item("Skittles", 1, 6);
        Item snickers = new Item("Snickers", 1, 6);
        Item juicyFruit = new Item("Juicy Fruit", .5, 6);
        Item doubleMint = new Item("Double Mint Gum", .5, 6);
        
        //System.out.println(lays);
        jake.addItem(lays);
        jake.addItem(sunChips);
        jake.addItem(pepsi);
        jake.addItem(mug);
        jake.addItem(skittles);
        jake.addItem(snickers);
        jake.addItem(juicyFruit);
        jake.addItem(doubleMint);
        boolean again = true;
        while(again) {
            System.out.println("Welcome to my vending machine program\n" +
                                "Would you like to buy Chips, Soda, Candy, or Gum? ");
            String input = kb.next();
            
            input.toLowerCase();
            
            boolean keepOn = true;
            
            do {
                switch(input){
                    case "chips":
                        System.out.println("Lays or Sun Chips? (lays/sun) \n");
                        input = kb.next();
                        keepOn = false;
                        break;
                    case "soda":
                        System.out.println("Pepsi or Mug Root Beer (mug)?\n");
                        input = kb.next();
                        keepOn = false;
                        break;
                    case "candy":
                        System.out.println("Skittles or Snickers?\n");
                        input = kb.next();
                        keepOn = false;
                        break;
                    case "gum":
                        System.out.println("Juicy Fuit or Double Mint? (jf/dm)\n");
                        input = kb.next(); 
                        keepOn = false;
                        break;
                    default:
                        System.out.println("I don't have any of those, please try again."); 
                    }
                }
                while(keepOn);
                
                keepOn = true;
                input.toLowerCase();
                int amountToPurchase;
                
                do {
                    switch(input) {
                        case "lays":
                            if(lays.inventory > 0) {
                                System.out.println("How Many?");
                                amountToPurchase = kb.nextInt();
                                jake.sellItem(lays, amountToPurchase);
                                System.out.println("Enjoy your " + input + "!");
                                keepOn = false;
                            }
                            else {
                                System.out.println("Sold Out");
                            }
                          
                            break;
                        case "sun":
                            if (sunChips.inventory > 0) {
                            System.out.println("How Many?");
                            amountToPurchase = kb.nextInt();
                            jake.sellItem(sunChips, amountToPurchase);
                            System.out.println("Enjoy your " + input + "!");
                            keepOn = false;
                            }
                            else {
                                System.out.println("Sold Out");
                            }
                            break;
                        case "pepsi":
                            if(pepsi.inventory > 0) {
                            System.out.println("How Many?");
                            amountToPurchase = kb.nextInt();
                            jake.sellItem(pepsi, amountToPurchase);
                            System.out.println("Enjoy your " + input + "!");
                            keepOn = false;
                            }
                            else {
                                System.out.println("Sold Out");
                            }
                            break;
                        case "mug":
                            if(mug.inventory > 0) {
                            System.out.println("How Many?");
                            amountToPurchase = kb.nextInt();
                            jake.sellItem(mug, amountToPurchase);
                            System.out.println("Enjoy your " + input + "!");
                            keepOn = false;
                            }
                            else {
                                System.out.println("Sold Out");
                            }
                            break;
                        case "skittles":
                            if(skittles.inventory > 0) {
                            System.out.println("How Many?");
                            amountToPurchase = kb.nextInt();
                            jake.sellItem(skittles, amountToPurchase);
                            System.out.println("Enjoy your " + input + "!");
                            keepOn = false;
                            }
                            else {
                                System.out.println("Sold Out");
                            }
                            break;
                        case "snickers":
                            if(snickers.inventory > 0) {
                            System.out.println("How Many?");
                            amountToPurchase = kb.nextInt();
                            jake.sellItem(snickers, amountToPurchase);
                            System.out.println("Enjoy your " + input + "!");
                            keepOn = false;
                            }
                            else {
                                System.out.println("Sold Out");
                            }
                            break;
                        case "jf":
                            if(juicyFruit.inventory > 0) {
                            System.out.println("How Many?");
                            amountToPurchase = kb.nextInt();
                            jake.sellItem(juicyFruit, amountToPurchase);
                            System.out.println("Enjoy your " + input + "!");
                            keepOn = false;
                            }
                            else {
                                System.out.println("Sold Out");
                            }
                            break;
                        case "dm":
                            if(doubleMint.inventory > 0) {
                            System.out.println("How Many?");
                            amountToPurchase = kb.nextInt();
                            jake.sellItem(doubleMint, amountToPurchase);
                            System.out.println("Enjoy your " + input + "!");
                            keepOn = false;
                            }
                            else {
                                System.out.println("Sold Out");
                            }
                            break;
                        default:
                            System.out.println("That is not a valid entry, please try again");
                            keepOn = true;
                            break;
                    }
                }
                while(keepOn); 
                
                System.out.println("Would you like to buy anything else? (y/n) ");
                input = kb.next();
                if (input.equals("n")) 
                    again = false;
         }
         
         //print the current state of the machine
         System.out.println(jake);
                    
    }
}