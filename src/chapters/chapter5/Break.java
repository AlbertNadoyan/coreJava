package chapters.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first: {
            second: {
            third: {
                System.out.println("precedes the break statement");
                if(t){
                    break second;
//                    System.out.println("Don't work");
                }
                System.out.println("Don't work");
            }
            }
            System.out.println("Next second block");
        }
    }
}
