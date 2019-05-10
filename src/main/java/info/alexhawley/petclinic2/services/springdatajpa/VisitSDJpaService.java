package info.alexhawley.petclinic2.services.springdatajpa;

import info.alexhawley.petclinic2.model.Vet;
import info.alexhawley.petclinic2.model.Visit;
import info.alexhawley.petclinic2.repositories.VetRepository;
import info.alexhawley.petclinic2.repositories.VisitRepository;
import info.alexhawley.petclinic2.services.VetService;
import info.alexhawley.petclinic2.services.VisitService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class VisitSDJpaService implements VisitService {

    private VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        Set<Visit> visits = new HashSet<>();
        visitRepository.findAll().forEach(visits::add);
        return visits;
    }

    @Override
    public Visit findById(Long aLong) {

        return visitRepository.findById(aLong).orElse(null);
    }

    @Override
    public Visit save(Visit object) {

        return visitRepository.save(object);
    }

    @Override
    public void delete(Visit object) {
        visitRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        visitRepository.deleteById(aLong);
    }
}
