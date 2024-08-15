package org.example.DTO;

public class BookDTO {

    private int id;
    private String title;
    private Long ISBN;
    private String author;


    public BookDTO(String title, Long ISBN, String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    public BookDTO(int id, String title, Long ISBN, String author) {
        this.id = id;
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;

    }

    public BookDTO() {
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