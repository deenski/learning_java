public class Chapter7Work_2 {
    public static void main(String[] args) {
        IntClass d1 = new IntClass();
        IntClass d2 = new IntClass();
        
        for (int i = 0; i < 10; i++) {
            int total = rollDice(d1, d2);
            System.out.println("You rolled " + d1.getNum()
                + " and " + d2.getNum());
            System.out.println("You rolled a " + total);
        }
    }
    public static int rollDice(int dice1, int dice2){
        dice1 = (int) (Math.random() * 6) + 1;
        dice2 = (int) (Math.random() * 6) + 1;
        //System.out.println("Dice 1 = " + dice1);
        //System.out.println("Dice 2 = " + dice2);
        int sum = dice1 + dice2;
        
        return sum;
    }
    public static int rollDice(IntClass dice1, IntClass dice2) {
        dice1.setNum((int) (Math.random() * 6) + 1);
        //dice1.setNum(4);
        dice2.setNum((int) (Math.random() * 6) + 1);
        
        return (dice1.getNum() + dice2.getNum());
        
        
        
    }
}