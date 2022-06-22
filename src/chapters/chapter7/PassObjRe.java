package chapters.chapter7;

public class PassObjRe {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        ob.meth(ob);
        System.out.println("ob.a and ob.b before the call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after the call: " + ob.a + " " + ob.b);
    }
}
