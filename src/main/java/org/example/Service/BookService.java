//package org.example.Service;
//
//import org.example.DAO.Book;
//
//public class BookService {
//
//    private final Book bookDao;
//
//
//    public BookService(Book bookDao) {
//        this.bookDao = bookDao;
//    }
//
//
////    public BookDto findById(Long id) {
////        Book book = bookDao.findById(id);
////        return BookMapper.toDto(book);
////    }
////
////    public List<BookDto> findAll() {
////        List<Book> books = bookDao.findAll();
////        return books.stream()
////                .map(BookMapper::toDto)
////                .collect(Collectors.toList());
////    }
//
//    public void createBook(BookDto bookDto) {
//        Book book = BookMapper.toEntity(bookDto);
//        bookDao.save(book);
//        bookDto.setId(book.getId());
//    }
//
//    public void updateBook(BookDto bookDto) {
//        Book book = BookMapper.toEntity(bookDto);
//        bookDao.update(book);
//    }
//
//    public void deleteBook(Long id) {
//        bookDao.delete(id);
//    }
//}


