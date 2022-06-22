package homeworks.methodsArrayUtil;

public class ArrayUtilDemo {
    public static void main(String[] args) {
        int[] arr = {5, 30, -8, 2, 58, 71, 11, 27, -45, 9};
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'i'};
        char[] bobArray = {'b', 'o', 'b', 'o', 'l', 'b'};
        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
        ArrayUtil au = new ArrayUtil();
        int maxElem = au.arrayMax(arr);
        System.out.println("Max element in array: " + maxElem);
        int minElem = au.arrayMin(arr);
        System.out.println("Min element in array: " + minElem);
        int average = au.arrayAverage(arr);
        au.evenNumber(arr);
        au.oddNumber(arr);
        System.out.println("Average number in array: " + average);
        int sumElem = au.arraySumElement(arr);
        System.out.println("Array sum: " + sumElem);
        au.arrayBubbleSort(arr);
        System.out.println();
        au.arrayBubbleSortRevers(arr);
        System.out.println();
        char[] newSpaceArray = au.spaceArr(spaceArray);
        System.out.println(newSpaceArray);
        int charSymbolCount = au.symbolCount(chars);
        System.out.println(charSymbolCount);
        au.middleChar(chars2);
        boolean charArrToEnd = au.endsChar(chars3);
        System.out.println(charArrToEnd);
        boolean bobChar = au.bobChar(bobArray);
        System.out.println(bobChar);
        au.charArrNotSpace(text);
    }
}
