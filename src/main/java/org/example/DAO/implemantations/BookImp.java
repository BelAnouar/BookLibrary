package org.example.DAO.implemantations;


import org.example.Entites.BookEntitie;


import java.util.List;

public interface BookImp {

  boolean addBook(BookEntitie book);
  boolean removeBook(int bookId);
  BookEntitie getBook(int id);
  List<BookEntitie> getAllBooks();
  boolean updateBook(BookEntitie book);


}
