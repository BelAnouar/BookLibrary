package org.example.Entites;

public class BookEntitie {
    private int id;
    private String title;
    private Long ISBN;
    private String author;


    public BookEntitie(String title, Long ISBN, String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public BookEntitie(int id, String title, Long ISBN, String author) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;

    }
    public BookEntitie() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getISBN() {
        return ISBN;
    }

    public void setISBN(Long ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                              '}';
    }
}
