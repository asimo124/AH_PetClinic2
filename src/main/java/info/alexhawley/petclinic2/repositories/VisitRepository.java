package info.alexhawley.petclinic2.repositories;

import info.alexhawley.petclinic2.model.Vet;
import info.alexhawley.petclinic2.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {


}
