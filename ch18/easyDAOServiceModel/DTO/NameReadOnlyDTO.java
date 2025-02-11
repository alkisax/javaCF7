package gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DTO;

public class NameReadOnlyDTO {
    private String name;

    public NameReadOnlyDTO (){}

    public NameReadOnlyDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
