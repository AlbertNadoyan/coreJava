package homeworks.dinamicArray;

public class DynamicArrayDemo {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
        dynamicArray.add(9);
        dynamicArray.add(45);
        dynamicArray.add(45);
        dynamicArray.add(6);
        dynamicArray.add(45);

        dynamicArray.add(100);
        dynamicArray.add(-9);
        dynamicArray.add(1);
        dynamicArray.add(33);
        dynamicArray.add(10);
        dynamicArray.add(0);
        dynamicArray.add(100);
        dynamicArray.add(101);
        dynamicArray.add(102);
        System.out.print("Array list: ");
        dynamicArray.printArray();
        System.out.println();
        System.out.println("Array is empty: " + dynamicArray.isEmpty());
        System.out.println("Get element by index: " + dynamicArray.getByIndex(2));
        System.out.println("Get index by element: " + dynamicArray.getFirstIndexByValue(6));
        System.out.print("Set method: ");
        dynamicArray.set(2, 8);
        System.out.println();
        System.out.print("Delete method: ");
        dynamicArray.delete(2);
        dynamicArray.printArray();
        System.out.println();
        System.out.print("Add method: ");
        dynamicArray.add(1, 300);
        dynamicArray.printArray();


    }
}
