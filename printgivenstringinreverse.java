import java.util.Arrays;

public class printgivenstringinreverse {
    public static void main(String[] args) {
        String str = "Hello How Are You";
        char stack [] = new char [str.length()];
        int top = -1;
        for(int i = 0 ; i < str.length() ; i++){
            top = push(stack, str, top);
        }
        System.out.println(Arrays.toString(stack));
        for(int i = 0 ; i < str.length() ; i++){
            top = pop(stack, top);
        }
    }
    public static int push (char stack [],String str, int top){
        top++;
        stack[top] = str.charAt(top);
        return top;
    }
    public static int pop (char stack [],int top){
        System.out.print(stack[top]);
        return --top;
    }
}
