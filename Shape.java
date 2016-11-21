
public abstract class Shape {
	public static int cCount=0, rCount=0, tCount=0, ttlCount=0;// all the counter for the shape
	double area, perimeter, id;
	String s;//object identities string representation 
    public abstract void area();
    public abstract void perimeter();
    
    static void display(){
    	System.out.println("Number of shapes is "+Shape.ttlCount);
    	System.out.println("Number of circle is "+Shape.cCount);
    	System.out.println("Number of triangle is "+Shape.tCount);
    	System.out.println("Number of rectangle is "+Shape.rCount);
    	System.out.println("......................................\n \n");
    	  }
    public double getId(){
    	return id;
    }
    public double getArea(){
    	return area;
    }
    public double getPerimeter(){
    	return perimeter;
    }
    public String getS(){
    	return s;
    	}
}