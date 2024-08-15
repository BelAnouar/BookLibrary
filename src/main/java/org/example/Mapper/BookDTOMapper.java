package org.example.Mapper;

import org.example.DTO.BookDTO;
import org.example.Entites.BookEntitie;

public class BookDTOMapper {
    public BookDTO toDTO(BookEntitie BookEntitie) {
        BookDTO BookDTO = new BookDTO();
        BookDTO.setId(BookEntitie.getId());
       BookDTO.setTitle(BookEntitie.getTitle());
        BookDTO.setAuthor(BookEntitie.getAuthor());
        BookDTO.setISBN(BookEntitie.getISBN());
        return BookDTO;
    }

    public  BookEntitie toEntity(BookDTO BookDTO) {
        BookEntitie bookEntitie = new BookEntitie();
        bookEntitie.setId(BookDTO.getId());
        bookEntitie.setTitle(BookDTO.getTitle());
        bookEntitie.setAuthor(BookDTO.getAuthor());
        bookEntitie.setISBN(BookDTO.getISBN());
        return bookEntitie;
    }
}
