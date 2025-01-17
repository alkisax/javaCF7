package gr.aueb.cf.exercises.ch16.uml1simple;

public class Circle extends AbstractShape implements ICircle{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getDiameter() {
        return radius * 2;
    }
}
