public class Item {
    String name;
    double price;
    int inventory;
    
    public Item() {
        this.name = "";
        this.price = 0.0;
        this.inventory = 0;
    }
    
    public Item(String n, double p, int inv) {
        this.name = n;
        this.price = p;
        this.inventory = inv;
    }
    
    public void setName(String n) {
        if (n.length() > 0) {
            this.name = n;
        }
    }
    
    public void setPrice(double p) {
        if (p > 0) {
            this.price = p;
        }
    }
    
    public void setInventory(int inv) {
        if (inv >= 0) {
            this.inventory = inv;
        }
    }
    
    public String toString() {
        String output = "\nItem Name: " + this.name + "\n" +
                        "Item Price: " + this.price + "\n";
        return output;
    }
}