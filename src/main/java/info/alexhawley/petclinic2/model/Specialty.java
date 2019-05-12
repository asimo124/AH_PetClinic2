package info.alexhawley.petclinic2.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(exclude = {"vets"})
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "specialties")
    private Set<Vet> vets = new HashSet<>();

    @Column(name = "description")
    private String description;
}
