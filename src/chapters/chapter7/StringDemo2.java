package chapters.chapter7;

public class StringDemo2 {
    public static void main(String[] args) {
        String strOb1 = "First string";
        String strOb2 = "Second string";
        String strOb3 = strOb1;
        System.out.println("Lenght str1: " + strOb1.length());
        System.out.println("Symbol on index3 in str1: " + strOb1.charAt(3));
        if(strOb1.equals(strOb2)){
            System.out.println("strOb1 == strOb2");
        }else {
            System.out.println("Str1 != str2");
        }
        if(strOb1.equals(strOb3)){
            System.out.println("str1Ob1 == str3Ob3");
        }else {
            System.out.println("strOb1 != strOb3");
        }
    }
}
