package homeworks.arrayutil;
import java.util.Scanner;

public class ArraySort {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
        int[] numbersArray = new int[5];
        System.out.println("Input numbers to sortable:");
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = inputNum.nextInt();
        }
        System.out.print("Numbers array list: ");
        for (int i : numbersArray) {
            System.out.print(i + " ");
        }

        System.out.println();

        int tmp = 0;
        System.out.print("Numbers array sort small to big: ");
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = i + 1; j < numbersArray.length; j++) {
                if(numbersArray[i] > numbersArray[j]){
                    tmp = numbersArray[i];
                    numbersArray[i] = numbersArray[j];
                    numbersArray[j] = tmp;
                }
            }
            System.out.print(numbersArray[i] + " ");
        }

        System.out.println();


        System.out.print("Numbers array sort big to small: ");
        for (int i = 0; i < numbersArray.length; i++) {
            for (int j = i + 1; j < numbersArray.length; j++) {
                if(numbersArray[i] < numbersArray[j]){
                    tmp = numbersArray[i];
                    numbersArray[i] = numbersArray[j];
                    numbersArray[j] = tmp;
                }
            }
            System.out.print(numbersArray[i] + " ");
        }


        }
    }

