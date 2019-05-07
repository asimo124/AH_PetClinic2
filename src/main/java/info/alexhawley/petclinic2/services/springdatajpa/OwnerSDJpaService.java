package info.alexhawley.petclinic2.services.springdatajpa;

import info.alexhawley.petclinic2.model.Owner;
import info.alexhawley.petclinic2.repositories.OwnerRepository;
import info.alexhawley.petclinic2.repositories.PetRepository;
import info.alexhawley.petclinic2.repositories.PetTypeRepository;
import info.alexhawley.petclinic2.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private OwnerRepository ownerRepository;
    private PetRepository petRepository;
    private PetTypeRepository petTypeRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetRepository petRepository,
                             PetTypeRepository petTypeRepository) {
        this.ownerRepository = ownerRepository;
        this.petRepository = petRepository;
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findOwnerByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> ownersSet = new HashSet<>();
        ownerRepository.findAll().forEach(ownersSet::add);
        return ownersSet;
    }

    @Override
    public Owner findById(Long aLong) {
        return ownerRepository.findById(aLong).orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        ownerRepository.deleteById(aLong);
    }
}