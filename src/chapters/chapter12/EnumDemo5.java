package chapters.chapter12;

public class EnumDemo5 {
    public static void main(String[] args) {
        Apple5 ap, ap2, ap3;

        System.out.println("All constant apple sort and ordinal()");
        for (Apple5 value : Apple5.values()) {
            System.out.println(value + " " + value.ordinal());
        }

        ap = Apple5.RedDel;
        ap2 = Apple5.GoldenDel;
        ap3 = Apple5.RedDel;
        System.out.println();

        //compareto and equals

        if(ap.compareTo(ap2)< 0){
            System.out.println(ap + " predshestvuet " +ap2);
        }

        if(ap.compareTo(ap2) > 0){
            System.out.println(ap2 + " predshestvuet " + ap);
        }
        if(ap.compareTo(ap3) == 0){
            System.out.println(ap + " = " + ap3);
        }
        System.out.println();

        if(ap.equals(ap2)){
            System.out.println("Error");
        }
        if(ap.equals(ap3)){
            System.out.println(ap + " = " + ap3);
        }

        if(ap == ap3){
            System.out.println(ap + " == " + ap3);
        }
    }

}
