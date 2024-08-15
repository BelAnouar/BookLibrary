package org.example.Main;

import org.example.DTO.BookDTO;
import org.example.Service.BookServiceImp;
import org.example.Service.interfaces.Bookservice;
import org.example.custom.ConsoleColors;

import java.util.List;
import java.util.Scanner;

public class BookMain {

    private final Bookservice bookService;
    private final Scanner scanner;

    public BookMain() {
        this.bookService = new BookServiceImp();
        this.scanner = new Scanner(System.in);
    }
    public void BookMenu() {
        System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT + "Choose an option from below:" + ConsoleColors.RESET);
        System.out.println("Press 1 to" + ConsoleColors.PURPLE_BOLD_BRIGHT + " Add Book " + ConsoleColors.RESET);
        System.out.println("Press 2 to" + ConsoleColors.PURPLE_BOLD_BRIGHT + " Update Book" + ConsoleColors.RESET);
        System.out.println("Press 3 to" + ConsoleColors.PURPLE_BOLD_BRIGHT + " Delete Book" + ConsoleColors.RESET);
        System.out.println("Press 4 to" + ConsoleColors.PURPLE_BOLD_BRIGHT + " Find Book" + ConsoleColors.RESET);
        System.out.println("Press 5 to" + ConsoleColors.PURPLE_BOLD_BRIGHT + " list of books" + ConsoleColors.RESET);
        System.out.println("Press 6 to" + ConsoleColors.PURPLE_BOLD_BRIGHT + " EXIT" + ConsoleColors.RESET);
       int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                this.addBook();
                break;
            case 2:
                this.updateBook();
                break;
            case 3:
                this.deleteBook();
                break;
            case 4:
                this.findBook();
                break;
            case 5:
                this.getAll();
                break;
            case 6:

                System.out.println("Exiting...");
                System.exit(0);
            default:
                System.out.println("Please enter a valid option");
                this.BookMenu();
        }
    }

    public void addBook() {

        BookDTO bookDTO = new BookDTO();

        System.out.println("Enter the ISBN:");

        bookDTO.setISBN(scanner.nextLong());

        System.out.println("Enter the Author:");

        bookDTO.setAuthor(scanner.nextLine());

        System.out.println("Enter the Title:");

        bookDTO.setTitle(scanner.nextLine());

        bookService.createBook(bookDTO);
        System.out.println("Book added successfully!");
    }

    public void updateBook() {


        BookDTO bookDTO = new BookDTO();
        System.out.println("Enter the id of the book to update:");
        int id = scanner.nextInt();
        bookDTO.setId(id);
        System.out.println("Enter the ISBN of the book to update:");
        long ISBN = scanner.nextLong();
        scanner.nextLine();
        bookDTO.setISBN(ISBN);

        System.out.println("Enter the new Author:");
        String author = scanner.nextLine();
        bookDTO.setAuthor(author);

        System.out.println("Enter the new Title:");
        String title = scanner.nextLine();
        bookDTO.setTitle(title);

        bookService.updateBook(bookDTO);
        System.out.println("Book updated successfully!");
    }

    public void deleteBook() {



        System.out.println("Enter the Id of the book to delete:");
        int ISBN = scanner.nextInt();

        bookService.deleteBook(ISBN);
        System.out.println("Book deleted successfully!");
    }

    public void findBook() {

        System.out.println("Enter the Id of the book to find:");
        int Id = scanner.nextInt();

        BookDTO book = bookService.getBook(Id);
        if (book != null) {
            System.out.println("Book found: " + book.getTitle() + " by " + book.getAuthor());
        } else {
            System.out.println("Book not found.");
        }
    }

    public void  getAll(){
        List<BookDTO> books = bookService.getBooks();
        if (books != null) {
            System.out.println("Books: " + books);
        } else {
            System.out.println("Book not found.");
        }
    }
}
