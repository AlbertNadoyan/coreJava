package chapters.chapter8.test1.test6;

public class DemoShipment {
    public static void main(String[] args) {
        Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
        Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);

        double vol;
        vol = shipment1.volume();
        System.out.println("Shipment1 = " + vol);
        System.out.println("Weight shipment1 = " + shipment1.weight);
        System.out.println("Price shipment1 = " + '$' + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("Shipment2 = " + vol);
        System.out.println("Weight shipment2 = " + shipment2.weight);
        System.out.println("Price shipment2 = " + '$' + shipment2.cost);
    }
}
