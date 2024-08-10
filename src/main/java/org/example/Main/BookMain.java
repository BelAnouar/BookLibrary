package org.example.Main;

import org.example.custom.ConsoleColors;

import java.util.Scanner;

public class BookMain {
    public static void BookMenu(){
        System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Choose  Option from Below According to your Designation  : " + ConsoleColors.RESET);
        System.out.println("Press 1 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " Add Book "+ ConsoleColors.RESET);
        System.out.println("Press 2 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " Update Book" + ConsoleColors.RESET);
        System.out.println("Press 3 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " Delete Book"+ ConsoleColors.RESET);
        System.out.println("Press 4 to" +ConsoleColors.PURPLE_BOLD_BRIGHT + " Find Book"+ ConsoleColors.RESET);
        System.out.println("Press 5 to" +ConsoleColors.PURPLE_BOLD_BRIGHT +" EXIT"+ ConsoleColors.RESET);
        Scanner in = new Scanner(System.in);
        switch (in.nextInt()){
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("Please enter a valid option");
                break;
        }
    }
}
