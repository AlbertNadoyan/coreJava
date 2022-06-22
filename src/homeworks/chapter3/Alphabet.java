package homeworks.chapter3;

public class Alphabet {
    public static void main(String[] args) {
        char letter;
        System.out.println("Small Alphabet");
        for(letter = 'a'; letter <= 'z'; letter++){
            System.out.print(letter + " ");
        }
        System.out.println();
        System.out.println("Capital Alphabet");
        for(letter = 'A'; letter <= 'Z'; letter++){
            System.out.print(letter + " ");
        }

    }
}
