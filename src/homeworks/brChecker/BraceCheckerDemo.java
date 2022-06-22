package homeworks.brChecker;

public class BraceCheckerDemo {
    public static void main(String[] args) {

        String text = "))}";
        BraceChecker braceChecker = new BraceChecker(text);
        braceChecker.check();
    }
}