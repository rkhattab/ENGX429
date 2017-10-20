package Rectangle;

/**
 *
 * @author Reem Khattab
 */

public class RectangleDemo {
    public static void main(String[] args) {
       
    		Rectangle r1 = new Rectangle(12,7);
        Rectangle r2 = new Rectangle(4.2, 3.9);
        
        System.out.println("Length of r1 = " + r1.getLength(r1.length));
        System.out.println("Width of r1 = " + r1.getWidth(r1.width));
        System.out.println("Perimeter of r1 = " + r1.getPerimeter());
        System.out.println("Area of r1 = " + r1.getArea()+ "\n");
        
        
        System.out.println("Length of r2 = " + r2.getLength(r2.length));
        System.out.println("Width of r2 = " + r2.getWidth(r2.width));
        System.out.println("Perimeter of r2 = " + r2.getPerimeter());
        System.out.println("Area of r2 = " + r2.getArea()+ "\n");
          
    } 
}
