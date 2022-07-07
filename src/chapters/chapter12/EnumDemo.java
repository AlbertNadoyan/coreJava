package chapters.chapter12;

public class EnumDemo {
    public static void main(String[] args) {
        Apple ap;
        ap = Apple.RedDel;

        System.out.println("Value ap " + ap);
        System.out.println();
        ap = Apple.GoldenDel;
        
        if(ap == Apple.GoldenDel){
            System.out.println("peremennaya ap soderjit GoldenDel. \n");
        }
        switch (ap){
            case Jonathan:
                System.out.println("Sort JOnathan red");
                break;
            case GoldenDel:
                System.out.println("Sort Golden Delicious yellow");
                break;
            case RedDel:
                System.out.println("Sort Red Delicious red");
                break;
            case Winesap:
                System.out.println("sort Winesap red");
                break;
            case Cortland:
                System.out.println("Sort Cortland red");
                break;
        }
    }
}
