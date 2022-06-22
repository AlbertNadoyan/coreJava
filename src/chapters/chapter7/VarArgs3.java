package chapters.chapter7;

public class VarArgs3 {
    static void  vaTest(int ... v){
        System.out.print("vaTest(int...): " + "Count arguments: " + v.length);
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void vaTest(boolean ... v){
        System.out.print("vaTest(boolean...)" + "count arguments: " + v.length + " content");
        for (boolean b : v) {
            System.out.print(b + "");
        }
        System.out.println();
    }

    static void vaTest(String msg, int ... v){
        System.out.print("vaTest(String, int ...): " + msg + v.length + "content: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
