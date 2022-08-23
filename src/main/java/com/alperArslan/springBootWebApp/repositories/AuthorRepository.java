package com.alperArslan.springBootWebApp.repositories;

import com.alperArslan.springBootWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;


public interface AuthorRepository extends CrudRepository<Author,Long> {
}
