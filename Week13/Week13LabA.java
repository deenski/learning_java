import java.util.*;

public class Week13LabA {
    public static void main(String[] args){
       Scanner kb = new Scanner(System.in);
       int l, w, a;
       boolean invalidInput = true;
       while(invalidInput == true)  {
           try {
                System.out.println("please enter a length");
                l = kb.nextInt();
           
                System.out.println("please enter a width");
                w = kb.nextInt();
           
                if (l < 0 || w < 0) {
                     throw new NegativeNumberException();
                }
                else {
               
                     a = l * w;
           
                     System.out.println("Area of your rectangle equals: " + a);
                     
                     invalidInput = false;
                }
       }
       catch(NegativeNumberException n) {
            System.out.println(n.getMessage());
       }
       
        
    }
}
}