//Jakob Vendegna
//CSC 160

//Area Calculator - modulated
import java.util.Scanner;


public class AreaCalculator {
    // I know we weren't supposed to use globals...
    public static Scanner kb = new Scanner (System.in);
    
    public static void main(String[] args) {
        
        //declare variables
        int length, width;
        double areaMain;
        
        //rectangle or triangle?
        String shape = whichShape();
        
        //if rectangle
        if (shape.charAt(0) == 'r') {
            length = getLength();
            width = getWidth();
            areaMain = calculateArea(length, width);
            System.out.printf("The area of your rectangle is %.0f.%n", areaMain);
            printShape(length, width);
        }
        
        //if triangle
        else {
            int base = getWidth();
            int height = getWidth();
            areaMain = calculateArea(shape, base, height);
            System.out.printf("The area of your triangle is %.0f.%n", areaMain);
            printShape(shape, base, height);
            
        }

    }
    
    //this method returns the length of the shape as an int
    public static int getLength() {
        System.out.println("Please enter the length or height of your shape");
        int length = kb.nextInt();
        return length;

    }
    
    //this method returns the width of the shape as an int
    public static int getWidth() {
        System.out.println("Please enter the width or base of your shape");
        int width = kb.nextInt();
        return width;
    }
    
    //calculate area of rrectangle
    public static int calculateArea(int length, int width){
        int area = length * width;
        return area;
    }
    
    //calculate area of triangle
    public static double calculateArea(String whatever, int base, int height) {
        double area = .5 * (base * height);
        return area;
    }
    
    //print the rectangle
    public static void printShape(int x, int y) {
       
        for(int i = 0; i < x; i++) {
            System.out.println();
            for (int z = 0; z < y; z++) {
                System.out.print("*");
                
            }
        }
    }
    
    //print the triangle
    public static void printShape(String someShape, double b, int h) {
        System.out.println("Abracadabra " + someShape + "!");
        
        // I know this does not take into account the height
        // the user entered. I just can't figure out how to 
        // implement that...
        for (int i = 1; i <= b; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
    
    //which shape does the user want to calculate the area of?
    public static String whichShape() {
        System.out.println("Would you like to find the area of a rectangle or triangle? :");
        String shape = kb.next();
        shape = shape.toLowerCase();
        
        return shape;
    }
}