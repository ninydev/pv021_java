package com.itstep.firstspring.repos;

import com.itstep.firstspring.entities.SiteContact;
import org.springframework.data.repository.CrudRepository;

public interface SiteContactsRepository extends CrudRepository<SiteContact, Long>
{
}
