import java.util.*;
public class Lab9B {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String n = kb.next();
        
        StringBuffer userName = new StringBuffer();
        userName.append(n);
        addGreeting(userName);
        System.out.println(userName);
        
    }
    public static void addGreeting(StringBuffer name) {
        name.insert(0, "Hello, ");
    }
}