package gr.aueb.cf.exercises.ch18.easyDAOServiceModel.model;

import java.util.Objects;

public class Name {
    private String name;

    public Name(){}

    //alt + ins
    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Name model)) return false;
        return Objects.equals(getName(), model.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getName());
    }

    @Override
    public String toString() {
        return "Model{" +
                "name='" + name + '\'' +
                '}';
    }
}
