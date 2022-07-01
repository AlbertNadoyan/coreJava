package homeworks.books;

public interface Commands {
    int EXIT = 0;
    int ADD_BOOK = 1;
    int PRINT_ALL_BOOKS = 2;
    int PRINT_BOOKS_BY_AUTHORNAME = 3;
    int PRINT_BOOKS_BY_GENRE = 4;
    int PRINT_BY_PRICE_RANGE = 5;
    int ADD_AUTHOR = 6;
    int PRINT_ALL_AUTHOR = 7;


    static void printCommand(){
        System.out.println("Input "  + EXIT + " for exit.");
        System.out.println("Input " + ADD_BOOK + " for add book.");
        System.out.println("Input " + PRINT_ALL_BOOKS + " for print all books.");
        System.out.println("Input " + PRINT_BOOKS_BY_AUTHORNAME + " for print books by author name.");
        System.out.println("Input " + PRINT_BOOKS_BY_GENRE + " for print books by genre.");
        System.out.println("Input " + PRINT_BY_PRICE_RANGE + " for print books by price range.");
        System.out.println("Input " + ADD_AUTHOR + " for add author.");
        System.out.println("Input " + PRINT_ALL_AUTHOR + " for print all author.");
    }
}
