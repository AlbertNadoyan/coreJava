package homeworks.books.storage;

import homeworks.books.models.Book;
import homeworks.books.models.Author;

public class BookStorage extends Book {
    private Book[] array = new Book[10];

    private int size = 0;

    public void add(Book value){
        if(size == array.length){
            Book[] tmp = new Book[array.length + 10];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
        array[size++] = value;
    }

    public void printArray(){
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    public void returnGetAuthor(Author authorName){
        for (int i = 0; i < size; i++) {
            while (array[i].getAuthor().equals(authorName)){
                System.out.println("such an author already exists");
            }
        }
    }

    public void printBookByAuthor(String bookByAuthor){
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(array[i].getAuthor().getAuthorName().equals(bookByAuthor)){
                System.out.println(array[i]);
                count++;
            }
        }
        if(count == 0){
            System.out.println("Invalid book author");
        }
    }

    public void printBookByGenre(String bGenre) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(array[i].getGenre().equals(bGenre)){
                System.out.println(array[i]);
                count++;
            }
        }
        if(count == 0){
            System.out.println("Invalid book genre");
        }
    }

    public void printByPriceRange(double firstPrice, double secondPrice) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(array[i].getPrice() <= secondPrice && array[i].getPrice() >= firstPrice){
                System.out.println(array[i]);
                count++;
            }

        }
        if(count == 0){
            System.out.println("Invalid book price range");
        }
    }




}
