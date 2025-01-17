package gr.aueb.cf.exercises.ch16.uml1simple;

public class AbstractShape implements IShape{
    private long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
