package gr.aueb.cf.exercises.ch16.uml1simple;

public class MainShape161 {
    public static void main(String[] args) {
        // Create a Circle
        Circle circle = new Circle(5.0);
        circle.setId(1);
        System.out.println("radius 5");
        System.out.println("Circle ID: " + circle.getId());
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Diameter: " + circle.getDiameter());

        // Create a Rectangle
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.setId(2);
        System.out.println("width 4, height 6");
        System.out.println("\nRectangle ID: " + rectangle.getId());
        System.out.println("Rectangle Area: " + rectangle.getArea());

        // Create a Line
        Line line = new Line(10.0);
        line.setId(3);
        System.out.println("length 10");
        System.out.println("\nLine ID: " + line.getId());
        System.out.println("Line Length: " + line.getLength());
    }
}
