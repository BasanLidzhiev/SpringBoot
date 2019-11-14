package ru.lidzhiev.spring5webappMaven.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import ru.lidzhiev.spring5webappMaven.entity.Author;
import ru.lidzhiev.spring5webappMaven.entity.Book;
import ru.lidzhiev.spring5webappMaven.entity.Publisher;
import ru.lidzhiev.spring5webappMaven.repositories.AuthorRepository;
import ru.lidzhiev.spring5webappMaven.repositories.BookRepository;
import ru.lidzhiev.spring5webappMaven.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData(){
        Author eric = new Author("Eric","Evans");
        Publisher harperColins = new Publisher("Harper Colins","address1");
        Book ddd = new Book("Data Driven Design","5678",harperColins);
        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        publisherRepository.save(harperColins);
        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod","Johnson");
        Publisher worx = new Publisher("Worx","address2");
        Book noEJB = new Book("J2EE Developement without EJB","23435",worx);
        rod.getBooks().add(noEJB);

        publisherRepository.save(worx);
        authorRepository.save(rod);
        bookRepository.save(noEJB);
    }
}
