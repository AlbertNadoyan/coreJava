package homeworks.books.storage;

import homeworks.books.models.User;
import homeworks.books.models.UserType;

public class UserStorage extends User {

    private User[] array = new User[10];
    private int size = 0;

    public int getSize() {
        return size;
    }



    public void setSize(int size) {
        this.size = size;
    }

    public void registrationUser(User value){
        if(size == array.length){
            User[] tmp = new User[array.length + 10];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
        array[size++] = value;
    }

    public void printUser(){
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    public void logUser(String userName, String userPassword) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(array[i].getUsername().equals(userName) && array[i].getPassword().equals(userPassword)){
                System.out.println("User created");
                System.out.println("Welcome " + array[i].getName() + " " + array[i].getSurname() + " your page.");
                count ++;
            }
        }
        if(count == 0){
            System.out.println("Invalid Username and/or password");
        }
    }

    public boolean getAdmin(UserType admin) {
        for (int i = 0; i < size; i++) {
            if (array[i].getUserType().equals(admin)) {
                return true;
            }
        }
        return false;
    }
}
