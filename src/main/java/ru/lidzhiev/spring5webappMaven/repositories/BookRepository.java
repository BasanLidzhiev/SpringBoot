package ru.lidzhiev.spring5webappMaven.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lidzhiev.spring5webappMaven.entity.Book;

public interface BookRepository extends CrudRepository<Book,Long> {
}
