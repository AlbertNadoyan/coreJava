package chapters.chapter12;

public class EnumDemo3 {
    public static void main(String[] args) {
        Apple3 ap;
        System.out.println("Price apple winesap "+ Apple3.Winesap.getPrice());

        System.out.println("Price all apple sort");
        for (Apple3 value : Apple3.values()) {
            System.out.println(value + " price " + value.getPrice());
        }
    }
}
