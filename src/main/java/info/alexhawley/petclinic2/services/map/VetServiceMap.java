package info.alexhawley.petclinic2.services.map;

import info.alexhawley.petclinic2.model.Specialty;
import info.alexhawley.petclinic2.model.Vet;
import info.alexhawley.petclinic2.services.SpecialtyService;
import info.alexhawley.petclinic2.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */
@Service
public class VetServiceMap extends AbstractServiceMap<Vet, Long> implements VetService {

    private SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {

        if (object.getSpecialties().size() > 0) {

            object.getSpecialties().forEach(specialty -> {

                if (specialty.getId() == null) {
                    Specialty savedSpecialty = specialtyService.save(specialty);
                    specialty.setId(savedSpecialty.getId());
                }
            });
        }
        return super.save(object);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
