public class AreaCalculator {
    
    // Method to calculate area
    public static double calculateArea(double length, double width) {
        return length * width;
    }
    
    public static void main(String[] args) {
        double area = calculateArea(5.0, 10.0); // Call the method
        System.out.println("Area of rectangle: " + area);
    }
}
