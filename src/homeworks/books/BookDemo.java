package homeworks.books;

import homeworks.books.exception.AuthorNotFoundException;
import homeworks.books.exception.ExitUserPage;
import homeworks.books.exception.UsernameAandPasswordLengthMismatch;
import homeworks.books.models.*;
import homeworks.books.storage.AuthorStorage;
import homeworks.books.storage.BookStorage;
import homeworks.books.storage.UserStorage;

import java.util.Scanner;

import static homeworks.books.models.UserType.ADMIN;
import static homeworks.books.models.UserType.USER;

public class BookDemo implements Commands{
    private static Scanner scanner = new Scanner(System.in);
    private static BookStorage bookStorage = new BookStorage();
    private static AuthorStorage authorStorage = new AuthorStorage();
    private static UserStorage userStorage = new UserStorage();


    public static void main(String[] args) throws AuthorNotFoundException, ExitUserPage, UsernameAandPasswordLengthMismatch {
        initData();
//        bookStorage.add(new Book("Ascanio", "Alexandre Dumas", 4200, 1, "Drama"));
//        bookStorage.add(new Book("Black tulip", "Alexandre Dumas", 2600, 3, "Drama"));
//        bookStorage.add(new Book("Fahrenheit 451", "Ray Bradbury", 3200, 2, "Novel"));
        boolean run = true;
        while (run) {
            Commands.printRegLog();
            int command;
            try {
                command = Integer.parseInt(scanner.nextLine());

            } catch (NumberFormatException e) {
                command = -1;
            }

            if(command == EXIT){
                run = false;
            }

            if (command == REGOSTRATION) {
                regUser();
            }

            if (command == LOGIN) {
                logUser();
                while (userStorage.getAdmin(ADMIN)){
                    Commands.printAdminCommand();
                    int adminCommand = Integer.parseInt(scanner.nextLine());
                    switch (adminCommand){
                        case ADD_BOOK:
                            addBooks();
                            break;
                        case ADD_AUTHOR:
                            addAuthor();
                            break;
                        }
                }

                while (userStorage.getAdmin(USER)){
                    Commands.printCommand();
                    int innerCommand = Integer.parseInt(scanner.nextLine());
                    switch (innerCommand) {
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
                        case PRINT_AUTHOR_BY_INDEX:
                            try {
                                printAuthorByIndex();
                            } catch (AuthorNotFoundException e) {
                                System.out.println("No author for your input index.");
                            }
                        case EXIT_USER_PAGE:
                            throw new ExitUserPage("User page not exit");
                        default:
                            System.out.println("Invalid value");
                            break;
                    }
                }
                }

            }
        }

    private static void initData() {
        Author goethes = new Author("Johann Wolfgang von Goethe", "German", Gender.MALE,  "noemail", "28 August 1749", "Free Imperial City of Frankfurt, Holy Roman Empire", "22 March 1832");
        Author dante = new Author("Dante Alighieri", "Italian",Gender.MALE, "nomale", "1265", "Florence, Republic of Florence", "14 September 1321");
        Author bronte = new Author("Charlotte Brontë", "English", Gender.FEMALE, "nomail", "21 April 1816", "Thornton, Yorkshire, England", "31 March 1855");
        authorStorage.addAuthor(goethes);
        authorStorage.addAuthor(dante);
        authorStorage.addAuthor(bronte);
        bookStorage.add(new Book("Faust", goethes, 6000, 6, "Drama"));
        bookStorage.add(new Book("Divine comedy", dante, 5000, 2, "Poems"));
        bookStorage.add(new Book("Jane Eyre", bronte, 4600, 7, "Novel"));
    }

    private static void logUser(){
        System.out.println("Input userName");
        String userName = scanner.nextLine();
        System.out.println("Input user password");
        String userPassword = scanner.nextLine();
        userStorage.logUser(userName, userPassword);
    }

    private static void regUser() throws UsernameAandPasswordLengthMismatch {
        System.out.println("Input user name");
        String uName = scanner.nextLine();
        System.out.println("Input user surname");
        String uSurname = scanner.nextLine();
        System.out.println("Input user years old");
        int uYears = 0;
        try {
            uYears = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Input only number");
        }

        System.out.println("Input user username");
        String uUserName = scanner.nextLine();
        System.out.println("Input user password");
        String uPassword = scanner.nextLine();
        if(uPassword.length() <= 5 && uUserName.length() <= 5){
            throw new UsernameAandPasswordLengthMismatch("username and password length mismatch");
        }
        UserType userType = regType();


        User registration = new User(uName, uSurname, uYears, uUserName, uPassword, userType);
        userStorage.registrationUser(registration);
        System.out.println("User created.");


    }

    private static UserType regType() {
        System.out.println("Chose registratio for admin or user.");
        UserType userType = null;
        try {
            userType = UserType.valueOf(scanner.nextLine().toUpperCase());
        }catch (IllegalArgumentException e){
            System.out.println("Invalid usertype");
        }
        return userType;
    }

    private static void printAuthorByIndex() throws AuthorNotFoundException {
        System.out.println("Input index for print author.");
        int authorIndex = 0;
        try {
            authorIndex = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Input only number for author index.");
            printAuthorByIndex();
        }
        authorStorage.printAuthorByIndex(authorIndex);
    }

    private static Author addAuthor() {
//        bookStorage.returnGetAuthor(bookStorage.getAuthor());

        System.out.println("Author object is created...");
        System.out.println("Input author name.");
        String authorName = scanner.nextLine();

        System.out.println("Input author nationality.");
        String authorNationality = scanner.nextLine();

        Gender gender = inputGender();

        System.out.println("Input author email.");
        String authorEmail = scanner.nextLine();

        System.out.println("Input author birth day.");
        String authorBirthDay = scanner.nextLine();

        System.out.println("Input author place of birth.");
        String authorPlaceOfBirth = scanner.nextLine();

        System.out.println("Input author date of death.");
        String authorDateOfDeath = scanner.nextLine();

        Author author = new Author(authorName, authorNationality, gender, authorEmail, authorBirthDay, authorPlaceOfBirth, authorDateOfDeath);
        authorStorage.addAuthor(author);
        return author;
    }

    private static Gender inputGender() {
        System.out.println("Chose author gender male or female");
        Gender g = null;
        try {
            g = Gender.valueOf(scanner.nextLine());
        }catch (IllegalArgumentException e){
            System.out.println("Invalid gender");
        }
        return g;
//        System.out.println("Chose author gender 1 is male - 2 is female.");
//        String c = null;
//        try {
//            c = String.valueOf(scanner.nextLine().charAt(0));
//            if(Integer.parseInt(c) == 1){
//                c = "male";
//            } else if (Integer.parseInt(c) == 2) {
//                c = "female";
//            }else {
//                System.out.println("Input only 1 or 2");
//                inputGender();
//            }
//        }catch (NumberFormatException e){
//            System.out.println("Input only number");
//            inputGender();
//        }
//        return c;
    }

    private static void printByPriceRange() {
        System.out.println("Input first number.");
        double firstPrice = 0;
        try {
            firstPrice = Double.parseDouble(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Only number");
        }
        System.out.println("Input second number.");
        double secondPrice = 0;
        try {
            secondPrice = Double.parseDouble(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Only number");
        }
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
                double bPrice = 0;
                int bCount = 0;
                try {
                    bPrice = Double.parseDouble(bPriceStr);
                    bCount = Integer.parseInt(bCountStr);
                }catch (NumberFormatException e){
                    System.out.println("Only number");
                }
                Book book = new Book(bTitle, addNewAuthor, bPrice, bCount, bGenre);
                bookStorage.add(book);
                System.out.println("Book created");

            }
        }









