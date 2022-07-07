package chapters.chapter12;

public class AskMe {
    static void answer(Answers result){
        switch (result){
            case NO:
                System.out.println("Net");
                break;
            case YES:
                System.out.println("Da");
                break;
            case MAYBE:
                System.out.println("Vazmojno");
                break;
            case LATER:
                System.out.println("Pozdnee");
                break;
            case SOON:
                System.out.println("vskore");
                break;
            case NEVER:
                System.out.println("Nekogda");
                break;
        }
    }

    public static void main(String[] args) {
        Question question = new Question();
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
        answer(question.ask());
    }
}
