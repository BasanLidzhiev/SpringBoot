package ru.lidzhiev.spring5webappMaven.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lidzhiev.spring5webappMaven.entity.Author;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
