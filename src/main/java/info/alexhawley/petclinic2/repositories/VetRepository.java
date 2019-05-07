package info.alexhawley.petclinic2.repositories;

import info.alexhawley.petclinic2.model.Specialty;
import info.alexhawley.petclinic2.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {


}
