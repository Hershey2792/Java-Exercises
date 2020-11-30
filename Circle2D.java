/*
 * Class: CMSC201 
 * Instructor:
 * Description: (Give a brief description for each Program)
 * Due: 10/25/2020
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Quentin Jefferies
*/


import java.lang.Math;

public class Circle2D {
    private double x; // set variables
    private double y;
    private double radius;

    // Constructor 1 3 args
    Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    // Constructor 1 no args
    //Set circle initial coordinates to (0,0) and radius = 1
    Circle2D() {
        this(0, 0, 1);
    }

    //Getters
    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRadius(){
        return radius;
    }

    public double getPerimeter(){
        return Math.PI * (radius * 2);
    }

    public double getArea(){
        return Math.PI * (radius * radius);
    }

    //Create methods
    /*Declare distance formula and identify whether distance formula is less or equal than 
    the sum of the set radius + the entered radius  */
    public boolean overlaps(Circle2D circle){//Is overlap distance between centers is less than the sum of the radii https://www.reddit.com/r/math/comments/3migb7/is_there_a_formula_for_checking_if_2_circles/
        double overlaps = Math.sqrt(Math.pow(circle.getX() - x, 2) + Math.pow(circle.getY() - y, 2));
        boolean doesOverlap = false;
        if (overlaps <= this.radius + circle.getRadius()){
            doesOverlap = true;
            return true;
        }
        else {
            return false;
        }
            
    }

    /*Distance formula using class x minus input x and class y minus input y 
    If distance formula is less than the radius of the circle object then c1 contains the coordinates */
    public boolean contains(double x, double y){//https://www.bbc.co.uk/bitesize/guides/z9pssbk/revision/4
        boolean doesContain;
        double contains = Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
        if (contains < radius){
            doesContain = true;
            return true;
        }
        else {
            return false;
        }
        
    }

    /* Same as contains method except our parameter takes in circle object
    if distance is less than radius squared then return true */
    public boolean contains(Circle2D circle){//https://www.bbc.co.uk/bitesize/guides/z9pssbk/revision/4
        boolean doesContainPoint = false;
        double xCenter = this.x;
        double yCenter = this.y;
        double contains = Math.pow((xCenter - circle.x), 2) + Math.pow((yCenter - circle.y), 2);
        if (contains < Math.pow(radius, 2)){
            doesContainPoint = true;
            return doesContainPoint;
        }
        else{
        return false;
        }
    }

    public static void main(String[] args) {
        //Create c1 object and get Perimeter and Area
        Circle2D c1 = new Circle2D(4, 3, 8);
        System.out.println("The Perimeter of c1 is " + Math.round(c1.getPerimeter()));
        System.out.println("The Area of c1 is " + Math.round(c1.getArea()));

        //Overlaps, contains, contains 
        System.out.println("C1 overlaps new circle: " + c1.overlaps(new Circle2D(4, 9, 10.5)));
        System.out.println("C1 contains new circle coordinates: " + c1.contains(5, 5));
        System.out.println("C1 contains new circle: " + c1.contains(new Circle2D(3, 10, 6)));
        
        


        
    }
}