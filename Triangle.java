public class Triangle extends Shape {
    private final double a, b, c; // sides
//normal constructor initialization
    public Triangle() {
        this(1,1,1);
        
        tCount++;
        ttlCount = cCount+ tCount + rCount;
        id = ttlCount;
        s = "Triangle Id:";
        
    }
    
    // Parameterize constructor initialization
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        
        tCount++;
        ttlCount = cCount+ tCount + rCount;
        id = ttlCount;
        s = "Triangle Id:";
    }

    @Override
    public void area() {
        //using Heron's formula:
        double s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public void perimeter() {
        perimeter = a + b + c;
    }
}