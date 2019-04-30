package info.alexhawley.petclinic2.services.map;

import info.alexhawley.petclinic2.model.Pet;
import info.alexhawley.petclinic2.services.OwnerService;
import info.alexhawley.petclinic2.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by jt on 7/21/18.
 */
@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    public PetServiceMap() {

    }

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {

        return super.save(object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
