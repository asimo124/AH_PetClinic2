package info.alexhawley.petclinic2.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "specialties")
public class Specialty extends BaseEntity {

    @ManyToMany(fetch = FetchType.EAGER, mappedBy = "specialties")
    private Set<Vet> vets = new HashSet<>();

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
