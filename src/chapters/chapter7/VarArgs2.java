package chapters.chapter7;

public class VarArgs2 {
    static void vaTest(String msg, int ... v){
        System.out.print(msg + v.length + " content: ");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
