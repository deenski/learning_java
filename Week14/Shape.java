public class Shape {
    private String type;
    private double area;
    private double perimeter;
    
    public Shape(){
        this.type = "square";
        this.perimeter = 4;
        this.area = 1;
    }
    public Shape(String t) {
        this.type = t;
    }
    public Shape(String t, double a) {
        this.type = t;
        this.area = a;
    }
    public Shape(String t, double a, double p) {
        this.type = t;
        this.area = a;
        this.perimeter = p;
    }
    public Shape(double a) {
        this.area = a;
    }
    public Shape(double a, double p) {
        this.area = a;
        this.perimeter = p;
    }
    public Shape(double p) {
        this.perimeter = p;
    }
    public Shape(String t, double p) {
        this.type = t;
        this.perimeter = p;
    }
    
    public void setType(String t) {
        if (t.length > 0) {
            this.type = t;
        }
    }
    
    public void setPerimeter(double p) {
        if (p > 0) {
            
        }
    }
}