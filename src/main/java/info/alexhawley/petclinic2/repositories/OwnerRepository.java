package info.alexhawley.petclinic2.repositories;

import info.alexhawley.petclinic2.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    public Owner findOwnerByLastName(String lastName);


}
