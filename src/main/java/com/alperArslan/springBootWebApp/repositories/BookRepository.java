package com.alperArslan.springBootWebApp.repositories;

import com.alperArslan.springBootWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {

}
