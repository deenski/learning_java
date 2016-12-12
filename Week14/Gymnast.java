public class Gymnast {

    private String name;
    private double[] scores;
    public final int NUM_SCORES = 3;
    
    public Gymnast(){
        this.name = "";
        this.scores = new double[NUM_SCORES];
    }
    
    public Gymnast(String n) {
        this.name = n;
        this.scores = new double[NUM_SCORES];
    }
    
    public void setScore(int index, double score) {
        if (index >= 0 && index < NUM_SCORES){
           this.scores[index] = score;
        }
    }
    
    public void setName(String n) {
        this.name = n;
    }
    
    public void setScores(double[] d) {
        if (d.length >= NUM_SCORES) {
            for (int i = 0; i < NUM_SCORES; i++) {
                this.scores[i] = d[i];
            }
        }
    }
    
    public String toString() {
        String s;
        s = "\nGymnast: \nName: " + this.name + "\nScores:\n";
        for (int i = 0; i < NUM_SCORES; i++) {
            s += this.scores[i] + ", ";
        }
        s += "\n";
        return s;
    }
    
    public double getAverage() {
        double sum = 0;
        for (int i = 0; i < NUM_SCORES; i++) {
            sum += this.scores[i];
        }
        return (sum / NUM_SCORES);
    }
    
    public String getName(){
        return this.name;
    }
    
    public double[] getScores(){
        return this.scores;
    }
    
    
}