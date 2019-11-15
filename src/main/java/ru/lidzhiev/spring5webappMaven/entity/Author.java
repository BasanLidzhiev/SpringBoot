package ru.lidzhiev.spring5webappMaven.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Publisher firstName;
    private Publisher lastName;


    @ManyToMany(mappedBy = "authors")
    Set<Book> books = new HashSet<>();

    public Author() {
    }

    public Author(Publisher firstName, Publisher lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Author(Publisher firstName, Publisher lastName, Set<Book> books) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Publisher getFirstName() {
        return firstName;
    }

    public void setFirstName(Publisher firstName) {
        this.firstName = firstName;
    }

    public Publisher getLastName() {
        return lastName;
    }

    public void setLastName(Publisher lastName) {
        this.lastName = lastName;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(id, author.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", books=" + books +
                '}';
    }
}
