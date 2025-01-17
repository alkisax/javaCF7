package gr.aueb.cf.exercises.ch16;

public class uml161 {


    // Interface IShape
    public interface IShape {
        long getId();
    }

    // Abstract class AbstractShape
    public abstract class AbstractShape implements IShape {
        private long id;

        @Override
        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }
    }

    // Interface ITwoDimensional
    public interface ITwoDimensional {
        double getArea();
    }

    // Circle class
    public class Circle extends AbstractShape implements ITwoDimensional {
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius * radius;
        }
    }

    // Rectangle class
    public class Rectangle extends AbstractShape implements ITwoDimensional {
        private double width;
        private double height;

        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        @Override
        public double getArea() {
            return width * height;
        }
    }

    // Line class
    public class Line extends AbstractShape {
        private double length;

        public Line(double length) {
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }
    }

}
