import java.util.Scanner;

public class Chapter7Work {
    
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = kb.nextInt();
        //System.out.println(absoluteValue(num));
        System.out.println("Please enter another number: ");
        int num2 = kb.nextInt();
        if (num != num2) {
            System.out.println("The larger of the two numbers is "
                            + findLarger(num2, num, 10));
        }
        else {
            printResult("You entered the same number twice");
        }
        
    }
    
    public static int absoluteValue(int x) {
        if (x >= 0) {
            return x;
        }
        else {
            return -x;
        }
    }
    
    public static int findLarger(int x, int y) {
        if (x > y) {
            return x;
        }
        else {
            return y;
        }
    }
    
    public static int findLarger(int x, int y, int z) {
        if (x > y && x > z) {
            return x;
        }
        else if (x < y && z < y) {
            return y;
        }
        else {
            return z;
        }
    }
    public static void printResult(String result) {
        System.out.println("ErrorErrorErrorErrorErrorErrorErrorError");
        System.out.println();
        System.out.println(result);
        System.out.println();
        System.out.println("ErrorErrorErrorErrorErrorErrorErrorError");
        
    }
}