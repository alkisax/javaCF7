package gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DAO;

import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.model.Name;

public interface INameDAO {
    Name insert (String name);
    Name update (String name);
    void delete(String name);
    Name getByName(String name);

    boolean nameExists(String name);
}
