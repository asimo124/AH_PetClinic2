package info.alexhawley.petclinic2.repositories;

import info.alexhawley.petclinic2.model.PetType;
import info.alexhawley.petclinic2.model.Specialty;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Specialty, Long> {


}
