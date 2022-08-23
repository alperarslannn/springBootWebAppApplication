package com.alperArslan.springBootWebApp.repositories;

import com.alperArslan.springBootWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
