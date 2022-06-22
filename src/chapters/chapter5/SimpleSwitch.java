package chapters.chapter5;

public class SimpleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++) {
            switch (i){
                case 0:
                    System.out.println("i = zero");
                    break;
                case 1:
                    System.out.println("i = one");
                    break;
                case 2:
                    System.out.println("i = two");
                    break;
                case 3:
                    System.out.println("i = three");
                    break;
                default:
                    System.out.println("i > three");
            }
        }
    }
}
