//Jakob Vendegna
// Vendegna_Car tester

import java.util.Scanner;

public class TestCar {
    public static void main(String[] args) {
       // create a new Scanner object
       Scanner kb = new Scanner(System.in);
       
       // create an empty Vendegna_Car
       Vendegna_Car baby = new Vendegna_Car();
       //test blank string, should change model from Tacoma to car.
       baby.setModel("");
       //test invalid year input, result should be 2010.
       baby.setYear(1858);
       //show the results
       System.out.print(baby.toString());
       
       // create another empty Vendegna_Car
       Vendegna_Car navigator = new Vendegna_Car();
       // set the model to Navigator
       navigator.setModel("Navigator");
       // set the year to 2015
       navigator.setYear(2015);
       // set the color to Yellow, expected output: yellow
       navigator.setColor("Yellow");
       // set the mileage to 22543
       navigator.setMileage(22543);
       // show the results
       System.out.print(navigator.toString());
       
       // create a Vendegna_Car, and pass it valid inputs for model, color, year, and mileage
       Vendegna_Car ram = new Vendegna_Car("Ram", "Blue", 2006, 12431);
       // show the results
       System.out.print(ram.toString());
       
       // create a Vendegna_Car, and pass it invalid inputs for model, color, year, and mileage
       Vendegna_Car modelT = new Vendegna_Car("", "MaGenTa", 1899, -15);
       // show the results
       System.out.print(modelT.toString());
       
       // create an empty Vendegna_Car to view default settings
       Vendegna_Car defaultCar = new Vendegna_Car();
       // show the results
       System.out.print(defaultCar.toString());
       
       // find out how many cars have been made
       System.out.println("There are " + Vendegna_Car.getCounter() + " Vendegna_Car(s) in existence.");
    }
}