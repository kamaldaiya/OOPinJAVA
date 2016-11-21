import java.util.Comparator;
import java.util.Vector;
import java.util.Collections;


public class MainShape implements Comparator<Shape> {
	//compare function for comparing specific part of the object that is area	
	public int compare(Shape o1, Shape o2)
    {
        return (int) Double.valueOf(o1.area).compareTo(Double.valueOf(o2.area));
    }
	
    public static void main(String[] args) {

    	// data structure "vector" declaration 
    	Vector<Shape> v  = new Vector<Shape>(10, 10);
    	
        //creating the object of various shapes
    	Shape rectangle[] = {new Rectangle(4,2), new Rectangle(5,7), new Rectangle(8,9)};
        Shape circle[] = {new Circle(9), new Circle(5), new Circle(3)};
        Shape triangle[] = { new Triangle(4,3,6), new Triangle(4,5,6),new Triangle(7,8,9)};
        
        // calculate the area and perimeter of the shape
        for(int i=0; i < 3;i++){
        	rectangle[i].area();
        	rectangle[i].perimeter();
        	
        	circle[i].area();
        	circle[i].perimeter();
        	triangle[i].area();
        	triangle[i].perimeter();
        }
        //inserting all objects of shape class into data structure "vector"
        for(int i=0;i< 3;i++){
        	v.addElement(rectangle[i]);
        }
        for(int i=0;i< 3;i++){
        	v.addElement(triangle[i]);
        }
        for(int i=0;i< 3;i++){
        	v.addElement(circle[i]);
        }
        
        // print counter for all shapes
        Shape.display();
        
        // sorting all info of shape object along with area 
        Comparator<Shape> comparator = new MainShape();
        Collections.sort(v, comparator);
        
        // printing all info along with sorted area
        for(int i=8; i>=0; i--){
        System.out.println(v.get(i).s+" "+v.get(i).id +" Area: " +v.get(i).getArea()+" and Perimeter: " +v.get(i).perimeter);
        }
       

    }
    

    
}