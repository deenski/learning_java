//Jakob Vendegna
public class Vendegna_Car {
    //set private variables
    private String model, color;
    private int year, mileage;
    private static int counter;
    
    //default constructor
    public Vendegna_Car() {
        setModel("Tacoma");
        setColor("Black");
        setYear(2010);
        setMileage(1000);
        counter++;
        
    } 
    //custom constructor, feed it a Model (m),
    // Color (c), Year (y), and Mileage (x)
    public Vendegna_Car(String m, String c, int y, int x){
        setModel(m);
        setColor(c);
        setYear(y);
        setMileage(x);
        counter++;
        
    }
    //change the model of the car
    public void setModel(String m) {
        int x = m.length();
        // make sure the model field isn't blank
        if (x > 0)
            this.model = m;
        else
            this.model = "car";
    }
    //change the color of the car
    public void setColor(String c) { 
        //send color to all lower case        
        c = c.toLowerCase();
        //switch to control allowable colors
        switch(c) {
            case "yellow":
            case "blue":
            case "white":
            case "red":
            case "green":
            case "purple":
            case "pink":
            case "orange":
            case "gray":
                this.color = c;
                break;
            default:
                this.color = "black";
        }
    }
    //set the year the car was made
    public void setYear(int y) {
        //not a lot of cars were around
        //prior to 1900
        if (y > 1900)
            this.year = y;
        else
            //if they enter a year below 1900
            //set the year to 2010
            this.year = 2010;
    }
    //set the mileage of the car
    public void setMileage(int x) {
        // no negative mileage
        if (x > 0) 
            this.mileage = x;
        else
            this.mileage = 1000;
    }
    // display the model of the car
    public String getModel() {
        return this.model;
    }
    // display the color of the car
    public String getColor() {
        return this.color;
    }
    // display the year of the car
    public int getYear() {
        return this.year;
    }
    // display the mileage of the car
    public int getMileage() {
        return this.mileage;
    }
    //method to display the class in string format
    public String toString() {
        String car = "Your Car has the following attributes: \n"
            + "Model = " + getModel() + "\n"
            + "Color = " + getColor() + "\n"
            + "Year = " + getYear() + "\n"
            + "Mileage = " + getMileage() + "\n \n";
        return car;
    }
    //method to display the amount of cars made
    public static int getCounter(){
        return counter;
    }
    
}