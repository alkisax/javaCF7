package gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DTO;

public class NameInsertDTO {
    private String name;

    public NameInsertDTO(){}

    public NameInsertDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
