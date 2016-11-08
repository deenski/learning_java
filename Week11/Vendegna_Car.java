public class Vendegna_Car {
    private String model, color;
    private int year, mileage;
    
    public Vendegna_Car() {
        setModel(model);
        setColor(color);
        setYear(year);
        setMileage(mileage);
    } 
    
    public setModel(x) {
        model = x;
    }
    
    public setColor(x) {
        color = x;
    }
    
    public setYear(x) {
        year = x;
    }
    
    public setMileage(x) {
        mileage = x;
    }
    
    public getModel() {
        return model;
    }
    
    public getColor() {
        return color;
    }
    
    public getYear() {
        return year;
    }
    
    public getMileage() {
        return mileage;
    }
    
    public toString(Vendegna_Car car) {
        system.out.printf("Your Car has the following attributes: %n"
            + "Model = %s%n"
            + "Color = %s%n"
            + "Year = %.0f%n"
            + "Mileage = %.0f%n", model, color, year, mileage);
    }
    
    
}