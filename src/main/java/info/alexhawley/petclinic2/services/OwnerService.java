package info.alexhawley.petclinic2.services;

import info.alexhawley.petclinic2.model.Owner;


/**
 * Created by jt on 7/18/18.
 */
public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
