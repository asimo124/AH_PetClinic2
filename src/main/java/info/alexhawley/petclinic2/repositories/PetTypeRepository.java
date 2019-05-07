package info.alexhawley.petclinic2.repositories;

import info.alexhawley.petclinic2.model.Pet;
import info.alexhawley.petclinic2.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {


}
