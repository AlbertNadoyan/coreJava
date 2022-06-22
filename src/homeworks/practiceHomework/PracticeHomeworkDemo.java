package homeworks.practiceHomework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework ph = new PracticeHomework();
        long second = ph.convert(6);
        System.out.println("Minute to seconds: " + second);
        int days = ph.calcAge(5);
        System.out.println("Year to days: " + days);
        int nextNum = ph.nextNumber(56);
        System.out.println("Next number is: " + nextNum);
        boolean equalNum = ph.isSameNum(6, 6);
        System.out.println("Number1 equal number2: " + equalNum);
        boolean lessEqualZero = ph.lessThanOrEqualToZero(6);
        System.out.println("Number is less than or equal to zero: " + lessEqualZero);
        boolean reverseValue = ph.reverse(true);
        System.out.println("Reverse value: " + reverseValue);
        int[] arr1 = new int[20];
        int[] arr2 = new int[45];
        int maxLenght = ph.maxlenght(arr1, arr2);
        System.out.println("Maximum lenght in array is: " + maxLenght);

    }
}
