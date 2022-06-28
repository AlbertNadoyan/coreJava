package homeworks.books;

import java.util.Scanner;

public class BookDemo implements Commands{
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    public static void main(String[] args) {
        bookStorage.add(new Book("Faust", "Goethe's", 6000, 6, "Drama"));
        bookStorage.add(new Book("Divine comedy", "Dante Alighieri", 5000, 2, "Poems"));
        bookStorage.add(new Book("Jane Eyre", "Charlotte Brontë", 4600, 7, "Novel"));
        bookStorage.add(new Book("Ascanio", "Alexandre Dumas", 4200, 1, "Drama"));
        bookStorage.add(new Book("Black tulip", "Alexandre Dumas", 2600, 3, "Drama"));
        bookStorage.add(new Book("Fahrenheit 451", "Ray Bradbury", 3200, 2, "Novel"));
        boolean run = true;
        while (run){
            System.out.println("Input "  + EXIT + " for exit.");
            System.out.println("Input " + ADD_BOOK + " for add book.");
            System.out.println("Input " + PRINT_ALL_BOOKS + " for print all books.");
            System.out.println("Input " + PRINT_BOOKS_BY_AUTHORNAME + " for print books by author name.");
            System.out.println("Input " + PRINT_BOOKS_BY_GENRE + " for print books by genre.");
            System.out.println("Input " + PRINT_BY_PRICE_RANGE + " for print books by price range.");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command){
                case EXIT:
                    run = false;
                    break;
                case ADD_BOOK:
                    addBooks();
                    break;
                case PRINT_ALL_BOOKS:
                    bookStorage.printArray();
                    break;
                case PRINT_BOOKS_BY_AUTHORNAME:
                    printBookByAuthorName();
                    break;
                case PRINT_BOOKS_BY_GENRE:
                    printBookByGenre();
                    break;
                case PRINT_BY_PRICE_RANGE:
                    printByPriceRange();
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
        }
    }

    private static void printByPriceRange() {
        System.out.println("Input first number.");
        double firstPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Input second number.");
        double secondPrice = Double.parseDouble(scanner.nextLine());
        bookStorage.printByPriceRange(firstPrice, secondPrice);
    }

    private static void printBookByAuthorName() {
        System.out.println("Input book author.");
        String bAuthor = scanner.nextLine();
        bookStorage.printBookByAuthor(bAuthor);
    }

    private static void printBookByGenre() {
        System.out.println("Input book genre.");
        String bGenre = scanner.nextLine();
        bookStorage.printBookByGenre(bGenre);
    }

    private static void addBooks(){
        System.out.println("Input book title.");
        String bTitle = scanner.nextLine();
        System.out.println("Input book author name.");
        String bAuthorName = scanner.nextLine();
        System.out.println("Input book price.");
        String bPriceStr = scanner.nextLine();
        System.out.println("Input book count.");
        String bCountStr = scanner.nextLine();
        System.out.println("Input book genre.");
        String bGenre = scanner.nextLine();

        double bPrice = Double.parseDouble(bPriceStr);

        int bCount = Integer.parseInt(bCountStr);

        Book book = new Book(bTitle, bAuthorName, bPrice, bCount, bGenre);
        bookStorage.add(book);
        System.out.println("Book created");
    }
}
