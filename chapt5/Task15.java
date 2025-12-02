package chapt5;

interface Shape {
    double calculateArea();
    double calculatePerimeter();
}

// 2. Create an abstract class called AbstractShape that implements the Shape interface
abstract class AbstractShape implements Shape {
    // Instance variables to represent common attributes of shapes.
    protected String color;
    protected double length; // Used by Rectangle
    protected double width;  // Used by Rectangle

    // A constructor to initialize these attributes.
    public AbstractShape(String color, double length, double width) {
        this.color = color;
        this.length = length;
        this.width = width;
    }

    // AbstractShape cannot provide meaningful implementation for Area/Perimeter
    // because it doesn't know the specific shape (e.g., if it's a Circle or Rectangle).
    // The implementation must be provided by the concrete subclasses (Circle and Rectangle).
    // Note: We leave the implementation abstract here, even though the task description
    // suggests implementing them. If we were to implement them, it would be based
    // on length/width, which makes it a poor abstraction for Circle.
    // Therefore, we correctly keep them abstract here to be implemented by Circle and Rectangle.
}


// 3. Implement two concrete classes that extend AbstractShape:

// Circle: Representing a circle. Include a radius as an attribute.
class Circle extends AbstractShape {
    private double radius;

    public Circle(String color, double radius) {
        // Pass dummy values (0, 0) for length and width as they are not used by Circle
        super(color, 0, 0); 
        this.radius = radius;
    }

    // Implementations for the calculateArea method (required by Shape interface)
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementations for the calculatePerimeter method (required by Shape interface)
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    public void displayDetails() {
        System.out.println("Shape: Circle");
        System.out.println("Color: " + color);
        System.out.println("Radius: " + radius);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Perimeter: %.2f%n", calculatePerimeter());
        System.out.println("-------------------------");
    }
}

// Rectangle: Representing a rectangle. Uses the inherited length and width.
class Rectangle extends AbstractShape {

    public Rectangle(String color, double length, double width) {
        // Use the inherited constructor to initialize color, length, and width
        super(color, length, width); 
    }

    // Implementations for the calculateArea method (required by Shape interface)
    @Override
    public double calculateArea() {
        return length * width;
    }

    // Implementations for the calculatePerimeter method (required by Shape interface)
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void displayDetails() {
        System.out.println("Shape: Rectangle");
        System.out.println("Color: " + color);
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.printf("Area: %.2f%n", calculateArea());
        System.out.printf("Perimeter: %.2f%n", calculatePerimeter());
        System.out.println("-------------------------");
    }
}


public class Task15 {
    public static void main(String args[]) {
        // 4. Create instances of Circle and Rectangle.
        Circle circle = new Circle("Blue", 5.0);
        Rectangle rectangle = new Rectangle("Red", 4.0, 6.0);
        
        // Display their areas and perimeters
        circle.displayDetails();
        rectangle.displayDetails();
    }
}