package gr.aueb.cf.exercises.ch18.easyDAOServiceModel.service;

import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DAO.NameDAOImpl;
import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.exceptions.NameAlreadyExistsException;
import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.model.Name;

import java.util.List;

public interface INameService {
    Name insertName (NameDAOImpl dto) throws NameAlreadyExistsException;
    Name updateName (NameDAOImpl dto) throws NameAlreadyExistsException;
    void deleteName (NameDAOImpl dto) throws NameAlreadyExistsException;
    Name getName (NameDAOImpl dto) throws NameAlreadyExistsException;
    List<Name> getAllNames();
}
