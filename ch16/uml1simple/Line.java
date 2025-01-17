package gr.aueb.cf.exercises.ch16.uml1simple;

public class Line extends AbstractShape implements ILine{
    private double length;

    public Line(double length) {
        this.length = length;
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    public double getLength() {
        return length;
    }
}
