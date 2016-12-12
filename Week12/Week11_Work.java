import java.util.*;

public class Week11_Work {
    public static final int SIZE = 5;
    
    public static void main(String[] args) {
    
        // Moved to fillArray method where it's used.
        //Scanner kb = new Scanner(System.in);
        
        double[] gradeList = new double[SIZE];
        System.out.println("Please enter " + SIZE + " grades: ");
        
        fillArray(gradeList);
        
        int result = findValue(gradeList, 88);
        if (result == -1) {
            System.out.println("That number is not in the list.");
        }
        else {
            System.out.println("That number is in the list at slot " + result);
        }
        
        
        //DONT DO THIS:
        //System.out.println(gradeList);
        // It will print the address of the array, because arrays are passed by reference.
        
        double sum = sumArray(gradeList);
        
        double avg = sum / SIZE;
        
        System.out.println("The average of grades : ");
        
        // for (int i = 0; i < gradeList.length; i++) {
//             System.out.println(gradeList[i]);
//         }
        
        //call printArray instead of the for loop above, 
        //but the loop is contained in the printArray method
        printArray(gradeList);
        
        System.out.printf("%nis: %.2f", avg);
        
        buildVector();
    }
    
    //generic method that will print any double array of any size
    public static void printArray(double[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i]);
            //System.out.print(ar[i] + ", ");
        }
    }
    //generic method that will fill any double array of any size
    public static void fillArray(double[] ar) {
        Scanner kb = new Scanner(System.in);
        for (int i = 0; i < ar.length; i++) {
            ar[i] = kb.nextDouble();
        }
    }
    
    public static double sumArray(double[] ar) {
        double sum = 0;
        for (int i = 0; i < SIZE; i++) {
            sum = sum + ar[i];
        }
        return sum;
    }
    
    // Generic method that searches any double array of any size, 
    // looking for searchItem. If it finds searchItem in that list,
    // return the index of the slot where it found it. Otherwise return -1.
    public static int findValue(double[] ar, double searchItem) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == searchItem){
                return i;
            }
            
        }
        return -1;
    }
    public static void buildVector() {
        Vector<String> list = new Vector<String>();
        list.addElement("Joe");
        list.addElement("Jake");
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.elementAt(i));
        }
    }
}