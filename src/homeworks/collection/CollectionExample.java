package homeworks.collection;

import java.util.*;

public class CollectionExample {

    public static void main(String[] args) throws NotIndexList {
//        String[] listForArray = {"aa", "bb", "cc", "dd"};
//        System.out.println(arrayToList(listForArray));
//        List<String> list = new ArrayList<>();
////        System.out.println(removeById(list, 6));
//        List<String> list1 = new ArrayList<>();
//        System.out.println(listToSet(list1));
//       System.out.println(listToSet(list1).getClass());
//        List<Integer> arrList = new ArrayList<>();
//        System.out.println(listToLinkedList(arrList));
//        System.out.println(listToLinkedList(arrList).getClass());
        List<String> intList = new ArrayList<>();
        System.out.println(sizeOfList(intList));

    }

    //մեթոդը գրել այնպես, որ կանչենք, ու իրան ստրինգների մասիվ տանք, ինքը վերադարձնի նույն էլեմենտներով ArrayList
    static List<String> arrayToList(String[] values) {
        List<String> arrayList = new ArrayList<>();
        for (String value : values) {
            arrayList.add(value);
        }
        return arrayList;
    }

    //մեթոդը գրել այնպես, որ կանչենք ու տանք ինչ որ լիստ, ու ինդեքս, ինքը ջնջե էդ ինդեքսի տակ գտնվող էլեմենտը, ու վերադարձնե նույն լիստը, առանց էդ էլեմենտի։
    static List<String> removeById(List<String> list, int index) throws NotIndexList {
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        if(index<list.size()){
            list.remove(index);
        }else {
            throw new NotIndexList("Not index");
        }
        return list;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած String-ների լիստ, վերադարձնի նույն արժեքներով HashSet
    static Set<String> listToSet(List<String> list) {
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
//        list.add("er");
//        list.add("rt");
//        list.add("er");
//        list.add("r");
//        list.add("r");

        HashSet<String> hashString = new HashSet<>(list);
//        for (int i = 0; i < list.size(); i++) {
//            hashString.add(String.valueOf(i));
//        }
        return hashString;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նույն արժեքներով LinkedList-ի օբյեկտ։
    static LinkedList<Integer> listToLinkedList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        LinkedList<Integer> linkList = new LinkedList<>(list);
//        for (int i = 0; i < list.size(); i++) {
//            linkList.add(i);
//        }
        return linkList;
    }

    // մեթոդը գրել այնպես, որ ընդունի ցանկացած Integer-ների լիստ, վերադարձնի նոր լիստ, որի մեջ էլեմենտները կլինեն հակառակ հերթականությամբ։
    static List<Integer> reverseNumbers(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        for (int i = 10; i > 0; i--) {
            list.removeAll(list);

        }
        return null;

    }

    // մեթոդը գրել այնպես, որ ինչ մեծությամբ լիստ էլ տանք էս մեթոդին, ինքը տպե մենակ սկզբի 5 հատը։
    static void printFirstFive(List<String> list) {

    }

    // մեթոդը գրել այնպես, որ ինչ list տանք վերադարձնի թե քանի էլեմենտ կա էդ լիստ-ի մեջ
    static int sizeOfList(List<String> list){
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        return list.size();
    }

}