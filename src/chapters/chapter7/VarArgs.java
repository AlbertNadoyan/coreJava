package chapters.chapter7;

public class VarArgs {
    static void vaTest(int ... v){
        System.out.print("Count arguments: " + v.length + " content:");
        for (int i : v) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
