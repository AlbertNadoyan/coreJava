package homeworks.practiceHomework;

public class PracticeHomework {
    long convert(int minutes){return minutes * 60;}

    int calcAge(int years){return years % 4 == 0 ? years * 365 + 1 : years * 365;}

    int nextNumber(int number){return number + 1;}

    boolean isSameNum(int a, int b){return  a == b ? true : false;}

    boolean lessThanOrEqualToZero(int value){return value <= 0 ? true : false;}

    boolean reverse(boolean value){return value == true ? false : true;}

    int maxlenght(int[] arr1, int[] arr2){return  arr1.length > arr2.length ? arr1.length : arr2.length;}
}
