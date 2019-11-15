package ru.lidzhiev.spring5webappMaven.entity;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private java.lang.String author;
    private java.lang.String isbn;
    @OneToOne
    private Publisher string;

    @ManyToMany
    @JoinTable(name = "author_book", joinColumns = @JoinColumn(name = "book_id"))
    private Set<Author> authors = new HashSet<>();

    public Book() {
    }

    public Book(java.lang.String author, java.lang.String isbn, Publisher string) {
        this.author = author;
        this.isbn = isbn;
        this.string = string;
    }

    public Book(java.lang.String author, java.lang.String isbn, Publisher string, Set<Author> authors) {
        this.author = author;
        this.isbn = isbn;
        this.string = string;
        this.authors = authors;
    }

    public java.lang.String getAuthor() {
        return author;
    }

    public void setAuthor(java.lang.String author) {
        this.author = author;
    }

    public java.lang.String getIsbn() {
        return isbn;
    }

    public void setIsbn(java.lang.String isbn) {
        this.isbn = isbn;
    }

    public Publisher getPublisher() {
        return string;
    }

    public void setPublisher(Publisher string) {
        this.string = string;
    }

    public Set<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public java.lang.String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + string + '\'' +
                ", authors=" + authors +
                '}';
    }
}
