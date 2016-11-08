//Jakob Vendegna
//CSC  160
//Week 10 Homework

import java.util.*;

public class Homework {
   public static void main(String[] args) {
        /* piglatin converter, enter a word and it will be converted
        to piglatin. */
        
        //sentenal control variable
      boolean run = true;
        //while run is true, loop through main
      do{
        /*used to determine if the word entered
        begins with a vowel, a common prefix, or neither. */
         int x = 0;
        
         Scanner kb = new Scanner(System.in);
        
         System.out.println("Enter a word and I will convert it to Pig Latin");
         System.out.println("type the word 'exit' to quit");
        
        //get the word and convert it to lower case.
         String userInput = kb.next();
         userInput.toLowerCase();
        
        /*if the user types the word exit, it will kill the program.
        But the method will still run, and the word exit will be converted
        due to the lack of a 'break' statement. */
         if (userInput.equals("exit")) {
            run = false;
            x = 1;
         }
         // figure out if the word starts with a vowel
         else if (beginsWithVowel(userInput)) {
            x = 1;
         }
         //figure out if the word starts with a common prefix
         else if (beginsWithPrefix(userInput)) {
            x = 2; 
         }
         //create a new StringBuffer object
         StringBuffer word = new StringBuffer();
         //store the user's input into the StringBuffer 
         word.append(userInput);
         //convert the StringBuffer to pigLatin
         pigLatinConverter(word, x);
         //print the converted word
         System.out.println(word);
         System.out.println();
      }
        while (run);
   }
   public static void pigLatinConverter(StringBuffer buffer, int i) {
        //if the word begins with a vowel
        if (i == 1) {
            //just add "yay" to the end of it
            buffer.append("yay");            
        }
        
        //if the word begins in a common prefix
        else if (i == 2) {
            //loop through the first two letters of the word
            for (int x = 0; x < 2; x++) {
                //add the first character in the word to the end of the word
                buffer.append(buffer.charAt(0));
                //then delete the first letter
                buffer.deleteCharAt(0);
            }
            //after the loop add "ay" to the end of the word
            buffer.append("ay");
        }
        // if the word does not start with a vowel or a common prefix
        else {
             //move the first letter to the end of the word
             buffer.append(buffer.charAt(0));
             buffer.deleteCharAt(0);
             //add "ay" to the end of the word
             buffer.append("ay");
        }
   }
    
   public static boolean beginsWithVowel(String str) {
       /*if the word entered begins with a vowel,
       return true. */
        
       Character alpha = str.charAt(0);
       switch (alpha) {
           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
           case 'y': 
               return true;
           default: 
               return false;
       }
   }
   public static boolean beginsWithPrefix(String str) {
          /* massive if statement to figure out
          if the word entered begins with a common
          prefix. Returns true if so, false if not */
        
          if (str.startsWith("bl"))
             return true;
          else if (str.startsWith("br"))
             return true;
          else if (str.startsWith("ch"))
             return true;
          else if (str.startsWith("cl"))
             return true;
          else if (str.startsWith("cr"))
             return true;
          else if (str.startsWith("dr"))
             return true;
          else if (str.startsWith("fl"))
             return true;
          else if (str.startsWith("fr"))
             return true;
          else if (str.startsWith("gl"))
             return true;
          else if (str.startsWith("gr"))
             return true;
          else if (str.startsWith("kl"))
             return true;
          else if (str.startsWith("ph"))
             return true;
          else if (str.startsWith("pl"))
             return true;
          else if (str.startsWith("pr"))
             return true;
          else if (str.startsWith("sh"))
             return true;
          else if (str.startsWith("sl"))
             return true;
          else if (str.startsWith("sp"))
             return true;
          else if (str.startsWith("sr"))
             return true;
          else if (str.startsWith("st"))
             return true;
          else if (str.startsWith("th"))
             return true;
          else if (str.startsWith("tr"))
             return true;
          else if (str.startsWith("wh"))
             return true;
          else if (str.startsWith("wr"))
             return true;
          else
             return false;
            
    }
}