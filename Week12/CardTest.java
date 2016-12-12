public class CardTest {
    public static void main(String[] args) {
    
        Card x = new Card("Hearts", 10);
        
        Card y = x.copyCard(x);
        
        System.out.println(y);
    }
    
}