public class GymnastTest {
    public static void main(String[] args) {
        carol();
        phoenix();
    }
    public static void carol() {
        Gymnast carol = new Gymnast("Carol");
        carol.setScore(0, 9.3);
        carol.setScore(1, 7.6);
        carol.setScore(2, 9.35);
        System.out.println(carol);
        double average = carol.getAverage();
        System.out.println("Average Score = " + average);
    }
    public static void phoenix() {
        double[] scores = {7.5, 8.6, 7.7};
        Gymnast phoenix = new Gymnast("Phoenix");
        phoenix.setScores(scores);
        System.out.println(phoenix);
        System.out.println("Average Score = " + phoenix.getAverage());
    }
}
