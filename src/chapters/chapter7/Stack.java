package chapters.chapter7;

public class Stack {
    private int stck[] = new int[10];
    private int tos;
    Stack(){
        tos = -1;
    }

    void push(int item){
        if(tos > stck.length - 1){
            System.out.println("Stack is full");
        }else {
            stck[++tos] = item;
        }
    }

    public int pop(){
        if(tos < 0){
            System.out.print("Stack empty");
        }
        return stck[tos--];
    }
}
