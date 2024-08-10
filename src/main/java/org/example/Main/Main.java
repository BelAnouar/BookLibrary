package org.example.Main;

import org.example.Entites.BookEntitie;
import org.example.DAO.Book;
import org.example.custom.ConsoleColors;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        Book Book = new Book();


      do {
          System.out.println(ConsoleColors.BROWN_BACKGROUND+ConsoleColors.WHITE_BOLD_BRIGHT+"Welcome to Book Library : "+ ConsoleColors.RESET);
          System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Choose  Option from Below According to your Designation  : " + ConsoleColors.RESET);
          System.out.println("Press 1 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " Book "+ ConsoleColors.RESET);
          System.out.println("Press 2 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " Member." + ConsoleColors.RESET);
          System.out.println("Press 3 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " Emprint"+ ConsoleColors.RESET);
          System.out.println("Press 4 to" +ConsoleColors.PURPLE_BOLD_BRIGHT +" EXIT"+ ConsoleColors.RESET);
          int ch = sc.nextInt();
          switch (ch) {
              case 1:
                 BookMain.BookMenu();
                  break;
              case 2:
                  int id=1;
                  System.out.println(Book.getAllBooks());
                  System.out.println(Book.getAllBooks().size());
                  System.out.println(Book.getBook(1));
                  break;
              case 3:
                  Book.removeBook(1);

                  break;
              default:
                  System.out.println(ConsoleColors.RED_BOLD_BRIGHT+"Invalid choice");
                  break;
          }
      }while (true);
    }
}