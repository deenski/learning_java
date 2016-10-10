
public class FiveCount {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.print(i + " ");
            if (i == 4) {
                System.out.println();
                counter();
                
            }
        }
    }
    
    public static void counter() {
        for (int i = 2; i <= 4; i ++) {
            System.out.println(i);
        }
    }
}