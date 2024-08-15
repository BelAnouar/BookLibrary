package org.example.Service.interfaces;

import org.example.DTO.BookDTO;

import java.util.List;

public interface Bookservice {


    void createBook(BookDTO bookDTO);
    BookDTO getBook(int id);
    List<BookDTO> getBooks();
    void updateBook(BookDTO bookDTO);
    void deleteBook(int id);

}
