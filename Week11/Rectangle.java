public class Rectangle{
    private double length;
    private double width;
    private double perimiter;
    private double area;
    private static int counter;
    
    public Rectangle() {
        setLength(1.0);
        setWidth(1.0);
        counter++;
    }
    
    public Rectangle(double l, double w) {
        setLength(l);
        setWidth(w);
        setArea();
        setPerimiter();
        counter++;
    }
    public void setLength(double x) {
        if (x > 0)
            length = x;
        else
            length = 1.0;
    }
    public void setWidth(double x) {
        if (x > 0)
            width = x;
        else
            width  = 1.0;
    }
    public void setPerimiter() {
        perimiter = (length * 2) + (width * 2);
    }
    public void setArea() {
        area = length * width;
    }
    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
    public double getPerimiter() {
        return perimiter;
    }
    public double getArea() {
        return area;
    }
    
    public String toString() {
        String output;
        output = "Length = " + length + "\n"
        + "Width = " + width + "\n"
        + "Perimeter = " + perimiter +"\n"
        + "Area = " + area + "\n";
        return output;
        
    }
    public static int getCounter() {
        return counter;
    }
    
}