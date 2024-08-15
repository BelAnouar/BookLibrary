package org.example.Service;

import org.example.DAO.Book;
import org.example.DTO.BookDTO;
import org.example.Entites.BookEntitie;
import org.example.Mapper.BookDTOMapper;
import org.example.Service.interfaces.Bookservice;

import java.util.List;
import java.util.stream.Collectors;

public class BookServiceImp implements Bookservice {

    private  Book bookDao;
    private BookDTOMapper bookDTOMapper;


    public BookServiceImp() {
        this.bookDao = new Book();
        this.bookDTOMapper = new BookDTOMapper();
    }


    @Override
    public void createBook(BookDTO bookDTO) {
        BookEntitie bookEntitie = bookDTOMapper.toEntity(bookDTO);
        bookDao.addBook(bookEntitie);
    }

    @Override
    public BookDTO getBook(int id) {
        BookEntitie bookEntitie = bookDao.getBook(id);
        return bookDTOMapper.toDTO(bookEntitie);
    }

    @Override
    public List<BookDTO> getBooks() {
        return bookDao.getAllBooks().stream()
                .map(bookDTOMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public void updateBook(BookDTO bookDTO) {
       BookEntitie bookEntity = bookDTOMapper.toEntity(bookDTO);
       bookDao.updateBook(bookEntity);
    }

    @Override
    public void deleteBook(int id) {
         bookDao.removeBook(id);
    }
}


