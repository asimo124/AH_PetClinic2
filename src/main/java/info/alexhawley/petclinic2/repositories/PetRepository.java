package info.alexhawley.petclinic2.repositories;

import info.alexhawley.petclinic2.model.Owner;
import info.alexhawley.petclinic2.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {


}
