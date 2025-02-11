//package gr.aueb.cf.exercises.ch18.easyDAOServiceModel.service;
//
//import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DAO.INameDAO;
//import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DAO.NameDAOImpl;
//import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DTO.NameInsertDTO;
//import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.exceptions.NameAlreadyExistsException;
//import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.exceptions.NameNotFoundException;
//import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.mapper.Mapper;
//import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.model.Name;
//
//import java.util.List;
//
//public class NameServiceImpl implements INameService{
//    private final INameDAO dao;
//
//    public NameServiceImpl(INameDAO dao){
//        this.dao = dao;
//    }
//
//    @Override
//    public Name insertName(NameInsertDTO dto) throws NameAlreadyExistsException {
//        Name name;
//        try {
//            if (dao.nameExists(dto.getName())){
//                throw new NameAlreadyExistsException("Service log: name %s already exists");
//            }
//            name = Mapper.mapInsertDTOToName(dto);
//            System.err.printf("Service log: name %s was inserted");
//            return dao.insert(dto.getName());
//        } catch (NameAlreadyExistsException e) {
//            System.err.printf("Service log: %s already exists", dto.getName());
//            throw e;
//        }
//    }
//
//    @Override
//    public Name updateName(NameUpdateDTO dto) throws NameNotFoundException {
//        try {
//            if (!dao.nameExists(dto.getName())) {
//                throw new NameNotFoundException(String.format("Service log: name %s not found", dto.getName()));
//            }
//
//            Name existingName = dao.getByName(dto.getName());
//            Name newName = Mapper.mapUpdateDTOToName(dto);
//
//            System.err.printf("Service log: %s was updated to %s%n", existingName.getName(), newName.getName());
//
//            return dao.update(newName.getName());
//        } catch (NameNotFoundException e) {
//            System.err.printf("Service log: %s not found%n", dto.getName());
//            throw e;
//        }
//    }
//}
//
//    @Override
//    public void deleteName(NameDAOImpl dto) throws NameAlreadyExistsException {
//
//    }
//
//    @Override
//    public Name getName(NameDAOImpl dto) throws NameAlreadyExistsException {
//        return null;
//    }
//
//    @Override
//    public List<Name> getAllNames() {
//        return List.of();
//    }
//}
