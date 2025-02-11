package gr.aueb.cf.exercises.ch18.easyDAOServiceModel.mapper;

import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DTO.NameInsertDTO;
import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DTO.NameReadOnlyDTO;
import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.DTO.NameUpdateDTO;
import gr.aueb.cf.exercises.ch18.easyDAOServiceModel.model.Name;

public class Mapper {
    /**
     * no instances of this class
     */
    private Mapper(){}

    public static Name mapInsertDTOToName (NameInsertDTO dto) {
        return new Name (dto
                .getName()
        );
    }

    public static Name mapUpdateDTOtoName (NameUpdateDTO dto) {
        return new Name(dto.getName());
    }

    public static NameReadOnlyDTO nameToDTO (Name name) {
        return new NameReadOnlyDTO(name.getName());
    }
}
