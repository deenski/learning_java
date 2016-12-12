//Jakob Vendegna

//create a new exception used to handle an invalid
//month entered in HomeworkV2.java
public class InvalidDateException extends Exception {
    //create the constructor
    public InvalidDateException(){
        //print this error message on catch
        System.out.println("You entered an invalid date");
    }
    //custom constructor. Pass it your own message.
    public InvalidDateException(String s) {
        System.out.println(s);
    }
}