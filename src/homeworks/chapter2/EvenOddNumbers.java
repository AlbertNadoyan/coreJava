package homeworks.chapter2;
import java.util.Scanner;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = sc.nextInt();
        System.out.print("Even Numbers: ");
        for(a = 1; a <= number; a++){
            if(a % 2 == 0){
                System.out.print(a + " ");
            }
        }
        System.out.println();
        System.out.print("Odd Numbers: ");
        for(a = 1; a <= number; a++){
            if(a % 2 == 1){
                System.out.print(a + " ");
            }
        }
    }
}
