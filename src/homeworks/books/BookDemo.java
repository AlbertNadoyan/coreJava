package homeworks.books;

import homeworks.books.models.Author;
import homeworks.books.models.Book;
import homeworks.books.storage.AuthorStorage;
import homeworks.books.storage.BookStorage;

import java.util.Scanner;

public class BookDemo implements Commands{
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();

    private static AuthorStorage authorStorage = new AuthorStorage();
    public static void main(String[] args) {
        Author goethes = new Author("Johann Wolfgang von Goethe", "German", "male",  "noemail", "28 August 1749", "Free Imperial City of Frankfurt, Holy Roman Empire", "22 March 1832");
        Author dante = new Author("Dante Alighieri", "Italian","male", "nomale", "1265", "Florence, Republic of Florence", "14 September 1321");
        Author bronte = new Author("Charlotte Brontë", "English", "female", "nomail", "21 April 1816", "Thornton, Yorkshire, England", "31 March 1855");
        authorStorage.addAuthor(goethes);
        authorStorage.addAuthor(dante);
        authorStorage.addAuthor(bronte);
        bookStorage.add(new Book("Faust", goethes, 6000, 6, "Drama"));
        bookStorage.add(new Book("Divine comedy", dante, 5000, 2, "Poems"));
        bookStorage.add(new Book("Jane Eyre", bronte, 4600, 7, "Novel"));
//        bookStorage.add(new Book("Ascanio", "Alexandre Dumas", 4200, 1, "Drama"));
//        bookStorage.add(new Book("Black tulip", "Alexandre Dumas", 2600, 3, "Drama"));
//        bookStorage.add(new Book("Fahrenheit 451", "Ray Bradbury", 3200, 2, "Novel"));
        boolean run = true;
        while (run){
            Commands.printCommand();
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
                case ADD_AUTHOR:
                    addAuthor();
                    break;
                case PRINT_ALL_AUTHOR:
                    authorStorage.printArray();
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
        }
    }

    private static Author addAuthor() {
        bookStorage.returnGetAuthor(bookStorage.getAuthor());

        System.out.println("Author object is created...");
        System.out.println("Input author name.");
        String authorName = scanner.nextLine();

        System.out.println("Input author nationality.");
        String authorNationality = scanner.nextLine();

        System.out.println("Chose author gender 1 is male - 2 is female.");
        String c = String.valueOf(scanner.nextLine().charAt(0));
        if(Integer.parseInt(c) == 1){
            c = "male";
        } else if (Integer.parseInt(c) == 2) {
            c = "female";
        }
        System.out.println("Input author email.");
        String authorEmail = scanner.nextLine();

        System.out.println("Input author birth day.");
        String authorBirthDay = scanner.nextLine();

        System.out.println("Input author place of birth.");
        String authorPlaceOfBirth = scanner.nextLine();

        System.out.println("Input author date of death.");
        String authorDateOfDeath = scanner.nextLine();

        Author author = new Author(authorName, authorNationality, c, authorEmail, authorBirthDay, authorPlaceOfBirth, authorDateOfDeath);
        authorStorage.addAuthor(author);
        return author;
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

    private static void addBooks() {
                System.out.println("Input book title.");
                String bTitle = scanner.nextLine();
                Author addNewAuthor = addAuthor();
                System.out.println("Input book price.");
                String bPriceStr = scanner.nextLine();
                System.out.println("Input book count.");
                String bCountStr = scanner.nextLine();
                System.out.println("Input book genre.");
                String bGenre = scanner.nextLine();
                double bPrice = Double.parseDouble(bPriceStr);

                int bCount = Integer.parseInt(bCountStr);
                Book book = new Book(bTitle, addNewAuthor, bPrice, bCount, bGenre);
                bookStorage.add(book);
                System.out.println("Book created");

            }
        }









