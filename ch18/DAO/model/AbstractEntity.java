package gr.aueb.cf.exercises.ch18.DAO.model;

public class AbstractEntity {
    private Long id;

    public AbstractEntity(){}

    public AbstractEntity(long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
