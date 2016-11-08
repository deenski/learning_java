public class RectangleTester {
    public static void main(String[] args) {
        Rectangle jake = new Rectangle(3, 4);
        System.out.println(jake.getLength());
        System.out.println(jake.getWidth());
        jake.setArea();
        System.out.println("Area = " + jake.getArea());
        System.out.println("Perimeter = " + jake.getPerimiter());
        
        System.out.println(jake.toString());
        Rectangle killer = new Rectangle();
        System.out.println(Rectangle.getCounter());
    }
}