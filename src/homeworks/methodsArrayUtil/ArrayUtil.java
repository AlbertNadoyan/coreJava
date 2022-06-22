package homeworks.methodsArrayUtil;

public class ArrayUtil {
    int arrayMax(int[] arr){
        int arrIndex = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > arrIndex){
                arrIndex = arr[i];
            }
        }
        return arrIndex;
    }

    int arrayMin(int[] arr){
        int arrIndex = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < arrIndex){
                arrIndex = arr[i];
            }
        }
        return arrIndex;
    }

    void evenNumber(int[] arr){
        System.out.print("Even Number: ");
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                countEven++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("Count even number:" + countEven);
    }

    void oddNumber(int[] arr){
        System.out.print("Odd number: ");
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 1){
                countOdd++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println("Count odd number: " + countOdd);
    }

    int arrayAverage(int[] arr){
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            count++;
        }
        return sum / count;
    }

    int arraySumElement(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    void arrayBubbleSort(int[] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    void arrayBubbleSortRevers(int[] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] < arr[j]){
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }

    char[] spaceArr(char[] space){
        int firstIndex = 0;
        int lastIndex = space.length - 1;
        while (firstIndex < lastIndex && space[firstIndex] == ' '){
            firstIndex++;
        }
        while (firstIndex < lastIndex && space[lastIndex] == ' '){
            lastIndex--;
        }
        char[] result = new char[(lastIndex - firstIndex) + 1];
        int index = 0;
        for (int i = firstIndex; i < lastIndex + 1; i++) {
            result[index++] = space[i];
        }
        return result;
    }

    int symbolCount(char[] charsArr){
        char c = 'o';
        int countSymbol = 0;
        for (int i = 0; i < charsArr.length; i++) {
            if(charsArr[i] == c){
                countSymbol++;
            }
        }
        return countSymbol;
    }

    void middleChar(char[] charsArr){
        System.out.print("Two symbol in chars array: " + charsArr[charsArr.length / 2 - 1] + " and ");
        System.out.println(charsArr[charsArr.length / 2]);
    }

    boolean endsChar(char[] charsArr){
        if(charsArr[charsArr.length - 1] == 'y' && charsArr[charsArr.length - 2] == 'l'){
            return true;
        }
        return false;
    }

    boolean bobChar(char[] charsArr){
        boolean bobText = false;
        for (int i = 0; i < charsArr.length - 2; i++) {
            if(charsArr[i] == 'b' && charsArr[i + 2] == 'b'){
                bobText = true;
            }
        }
        return bobText;
    }

    void charArrNotSpace(char[] charsArr){
        for (int i = 0; i < charsArr.length; i++) {
            if(charsArr[i] != ' '){
                System.out.print(charsArr[i]);
            }
        }
    }
}
