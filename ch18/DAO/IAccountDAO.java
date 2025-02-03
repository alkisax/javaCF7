package gr.aueb.cf.exercises.ch18.DAO;

import gr.aueb.cf.exercises.ch18.DAO.model.Contact;

import java.util.List;

public interface IAccountDAO {
    Contact insert (Contact contact);
    Contact update (Long id, Contact contact);
    void deleteById(Long id);
    Contact getById(Long id);
    List<Contact> getAll();

    Contact getByLastname (String lastname);
    Contact getByUsername (String username);

    boolean userIdExists(Long id);
    boolean usernameExists(String username);



}
