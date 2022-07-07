package chapters.chapter12;

public class EnumDemo2 {
    public static void main(String[] args) {
        Apple ap;
        System.out.println("Constants enum type Apple:");

        Apple allapples[] = Apple.values();
        for (Apple a : allapples) {
            System.out.println(a);
        }
//        for (Apple value : Apple.values()) {
//            System.out.println(value);
//        }
        System.out.println();

        ap = Apple.valueOf("Winesap");
        System.out.println("peremennaya ap soderjit " + ap);

    }
}
