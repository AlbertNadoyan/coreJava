package homeworks.books.storage;

import homeworks.books.Exception.AuthorNotFoundException;
import homeworks.books.models.Author;

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

    public void printAuthorByIndex(int authorIndex) throws AuthorNotFoundException {
        int authorCount = 0;
        for (int i = authorIndex; i < size; i++) {
            if(authorIndex == i){
                System.out.println(array[i]);
                authorCount++;
            }
        }
        if(authorCount == 0){
            throw new AuthorNotFoundException();
        }
    }

    public void printArray(){
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    public int getSize(){
        return size;
    }



}
