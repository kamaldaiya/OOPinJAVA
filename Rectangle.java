public class Rectangle extends Shape {
    private final double width, length; //sides

    public Rectangle() {
        this(1,1);
        rCount++;
        ttlCount = cCount+ tCount + rCount;
        id = ttlCount;
        s = "Rectangle Id:";
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        
        rCount++;
        ttlCount = cCount+ tCount + rCount;
        id = ttlCount;
        s = "Rectangle Id:";
    }

    @Override
    public void area() {
        // A = w * l
        area = width * length;
    }

    @Override
    public void perimeter() {
        // P = 2(w + l)
        perimeter =  2 * (width + length);
    }

}