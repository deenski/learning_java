import java.util.Scanner;
public class Lab9A {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a number, I will convert it to dog years");
        int age = kb.nextInt();
        IntClass dogAge = new IntClass();
        dogAge.setNum(age);
        dogYears(dogAge);
        
        System.out.println(age + " is equal to " + dogAge.getNum() + " in dog years");
    }
    public static void dogYears(IntClass ageObj) {
        int humanAge = ageObj.getNum();
        ageObj.setNum(humanAge * 7);
    }
}