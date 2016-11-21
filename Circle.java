public class Circle extends Shape {
    private final double radius;
    final double pi = Math.PI;

    public Circle() {
        this(1);
        cCount += 1;
        ttlCount = cCount+ tCount + rCount;
        id = ttlCount;
        s = "Circle Id:";
    }   
    public Circle(double radius) {
        this.radius = radius;
        cCount += 1;
        ttlCount = cCount+ tCount + rCount;
        id = ttlCount;
        s = "Circle Id:";
    }

    @Override
    public void area() {
        // A = π r^2
        area= pi * Math.pow(radius, 2);
    }

    public void perimeter() {
        // P = 2πr
        perimeter = 2 * pi * radius;
    }
}