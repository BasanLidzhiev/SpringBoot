package ru.lidzhiev.spring5webappMaven.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.lidzhiev.spring5webappMaven.entity.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
