package gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DAO;

import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.model.Name;

import java.util.ArrayList;
import java.util.List;

public class NameDAOImpl implements INameDAO{
    public static final List<Name> names = new ArrayList<>();

    @Override
    public Name insert(String name) {
        Name newName = new Name(name);
        names.add(newName);
        System.out.println("added " + name);
        return newName;
    }

    @Override
    public Name update(String name) {
        int index = getIndexByName(name);
        if (index != -1) {
            Name newName = new Name(name);
            names.set(index, newName);
            return newName;
        }
        return null;
    }

    @Override
    public void delete(String name) {
        int positionToReturn = getIndexByName(name);
        if (positionToReturn != -1){
            names.remove(positionToReturn);
            System.out.println("deleted" + name);
        }

    }

    @Override
    public Name getByName(String name) {
        int index = getIndexByName(name);
        if (index != -1) {
            return names.get(index);
        }
        System.out.println("Name not found: " + name);
        return null;
    }

    @Override
    public boolean nameExists(String name) {
        return getIndexByName(name) != -1;
    }

    private int getIndexByName (String name){
        int positionToReturn = -1;
        for (int i = 0; i < names.size(); i++){
            if (names.get(i).getName().equals(name)){
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }
}
