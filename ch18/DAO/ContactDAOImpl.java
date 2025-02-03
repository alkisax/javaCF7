package gr.aueb.cf.exercises.ch18.DAO;
import gr.aueb.cf.exercises.ch18.DAO.model.Contact;
import java.util.ArrayList;
import java.util.List;

public class ContactDAOImpl implements IAccountDAO{
    public static final List<Contact> contacts = new ArrayList<>();
    private static Long id = 1L;

    @Override
    public Contact insert(Contact contact) {
        contact.setId(this.id++);
        contacts.add(contact);
        return contact;
    }

    @Override
    public Contact update(Long id, Contact contact) {
        contacts.set(getIndexById(id), contact);
        return contact;
    }

    @Override
    public void deleteById(Long id) {
        int positionToReturn = getIndexById(id);
        if (positionToReturn != -1) {
            contacts.remove(getIndexById(id));
            System.out.println("deleted");
        } else {
            System.out.println("contact does not exists");
        }
    }

    @Override
    public Contact getById(Long id) {
       int positionToReturn = getIndexById(id);
       Contact contact = (positionToReturn != -1) ?
               contacts.get(positionToReturn) :
               null;
       return contact;
    }

    @Override
    public Contact getByLastname(String lastname) {
        int positionToReturn = getIndexById(id);
        Contact contact;
        if (positionToReturn != -1) {
            contact = contacts.get(getIndexByLastname(lastname));
        } else {
            System.out.println("contact does not exists");
            return null;
        }
        return contact;
    }

    @Override
    public Contact getByUsername(String username) {
        int positionToReturn = getIndexById(id);
        Contact contact;
        if (positionToReturn != -1) {
            contact = contacts.get(getIndexByUsername(username));
        } else {
            System.out.println("contact does not exists");
            return null;
        }
        return contact;
    }


    @Override
    public List<Contact> getAll() {
        return new ArrayList<>(contacts);
    }

    @Override
    public boolean userIdExists(Long id) {
        int position  = getIndexById(id);
        return position != -1;
    }

    @Override
    public boolean usernameExists(String username) {
        int position  = getIndexByUsername(username);
        return position != -1;
    }

    private int getIndexById (Long id) {
        int positionToReturn = -1;
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getId().equals(id)){
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    private int getIndexByUsername (String username) {
        int positionToReturn = -1;
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getUsername().equals(username)){
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }

    private int getIndexByLastname (String lastname) {
        int positionToReturn = -1;
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getUsername().equals(lastname)){
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
