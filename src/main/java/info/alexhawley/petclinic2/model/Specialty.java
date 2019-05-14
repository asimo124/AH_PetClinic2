package info.alexhawley.petclinic2.model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"vets"})
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "specialties")
    private Set<Vet> vets = new HashSet<>();

    @Column(name = "description")
    private String description;

    public Specialty(Long id, Set<Vet> vets, String description) {
        super(id);
        this.vets = vets;
        this.description = description;
    }
}
