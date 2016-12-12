import java.util.Vector;

public class VendingMachine {
    private String name;
    private double coinCounter;
    private Vector<Item> items = new Vector<Item>();
    
    public VendingMachine() {
         this.name = "Jake's Vending Machine";
         this.coinCounter = 0.0;
         this.items = items;
         
    }
    
    public VendingMachine(String n) {
        this.name = n;
        this.coinCounter = 0.0;
        this.items = items;
    }
    
    public String cashOnHand() {
        String output = "The machine has consumed " + this.coinCounter + " coins\n";
        return output;
    }
    
    public Vector<Item> totalInventory() {
        System.out.println(this.name + "'s current inventory: \n");
        return this.items;
    }
    
    public void addItem(Item a) {
        for (int i = 0; i < a.inventory; i++) {
            this.items.add(a);
        }
    }
    
    public void sellItem(Item a) {
        a.inventory = a.inventory - 1;
        this.items.removeElement(a);
        this.coinCounter = coinCounter + a.price;
        
    }
    
    public void sellItem(Item a, int amount) {
        a.inventory = a.inventory - amount;
        for(int i = 0; i < amount; i++) {
            this.items.removeElement(a);
            this.coinCounter = coinCounter + a.price;
        }
    }
    
    public String toString() {
        String output = "\nCurrent Cash on Hand : " + coinCounter + "\n" +
                        "Current Inventory: " + items + "\n";
        return output;
    }
    
}