package gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DTO;

public class NameUpdateDTO {
    private String name;

    public NameUpdateDTO(){}

    public NameUpdateDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
