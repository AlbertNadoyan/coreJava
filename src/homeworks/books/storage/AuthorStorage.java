package homeworks.books.storage;

import homeworks.books.models.Author;
import homeworks.books.models.Book;

public class AuthorStorage extends Author {
    private Author[] array = new Author[10];
    private int size = 0;

    public void addAuthor(Author value){
        if(size == array.length){
            Author[] tmp = new Author[array.length + 10];
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

    public int getSize(){
        return size;
    }

    public Author getAuthorByIndex(int index){
        if(index < 0 | index >= size){
            return null;
        }
        return array[index];
    }

}
