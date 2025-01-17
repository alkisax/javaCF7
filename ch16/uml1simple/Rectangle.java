package gr.aueb.cf.exercises.ch16.uml1simple;

public class Rectangle extends AbstractShape implements IRectangle{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
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
        return (width * height);
    }
}
