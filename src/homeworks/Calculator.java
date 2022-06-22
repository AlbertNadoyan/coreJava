package homeworks;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        int result;
        System.out.print("Input first number: ");
        int firstNum = myObj.nextInt();
        System.out.print("Input operator symbol \' + - * / \': ");
        char operator = myObj.next().charAt(0);
        System.out.print("Input second number: ");
        int secondNumber = myObj.nextInt();
        switch (operator){
            case '+':
                result = firstNum + secondNumber;
                System.out.println(firstNum + " + " + secondNumber + " = " + result);
                break;
            case '-':
                result = firstNum - secondNumber;
                System.out.println(firstNum + " - " + secondNumber + " = " + result);
                break;
            case '*':
                result = firstNum * secondNumber;
                System.out.println(firstNum + " * " + secondNumber + " = " + result);
                break;
            case '/':
                result = firstNum / secondNumber;
                System.out.println(firstNum + " / " + secondNumber + " = " + result);
                break;
            default:
                System.out.println("Invalid operator");
        }



    }
}
