package com.bookmaps;

public class Book {
    private String name;
    private Author author;
    private Genre genre;
    private int pageNumbers;
    private int publishingYear;

    public Book() {
    }

    public Book(String name, Author author, Genre genre, int pageNumbers, int publishingYear) {
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.pageNumbers = pageNumbers;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public int getPageNumbers() {
        return pageNumbers;
    }

    public void setPageNumbers(int pageNumbers) {
        this.pageNumbers = pageNumbers;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author=" + author.toString() +
                ", genre=" + genre.toString() +
                ", pageNumbers=" + pageNumbers +
                ", publishingYear=" + publishingYear +
                '}';
    }
}
