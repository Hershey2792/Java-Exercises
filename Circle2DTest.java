import java.util.Scanner;

class Circle2DTest {
    public static void main (String[] args) {
        double x1, x2;
        double y1, y2;
        double overLap1, overLap2;
        double contains1, contains2, contains3;
        double radius1, radius2, containsRadius;
        
        
        //take input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting coordinates x and y for c1: ");
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        System.out.println("Enter c1 radius: ");
        radius1 = sc.nextDouble();

        System.out.println("Enter x, y, and radius that c1 overlaps with: " );
        overLap1 = sc.nextDouble();
        overLap2 = sc.nextDouble();
        radius2 = sc.nextDouble();


        System.out.println("Enter coordinate point x and y and radius inside c1: ");
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();
        containsRadius = sc.nextDouble();

        System.out.println("Enter the circle2 coordinates inside c1: ");
        contains1 = sc.nextDouble();
        contains2 = sc.nextDouble();
        
        //Test user input after making 3 circle2d classes 
        while (true){
            Circle2D c1 = new Circle2D(x1, y1, radius1);
            Circle2D c2 = new Circle2D(x2, y2, containsRadius);
            Circle2D c3 = new Circle2D(overLap1, overLap2, radius2);

            System.out.println("The Perimeter of c1 is " + Math.round(c1.getPerimeter()));
            System.out.println("The Area of c1 is " + Math.round(c1.getArea()) + "\n");

            System.out.println("C1 overlaps new circle: " + c1.overlaps(c3));
            System.out.println("C1 contains new circle coordinates: " + c1.contains(contains1, contains2));
            System.out.println("C1 contains new circle: " + c1.contains(c2));
            return;
        }
            
    
        


    }
}