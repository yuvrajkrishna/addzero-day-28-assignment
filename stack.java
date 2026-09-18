public class stack{
    public static void main(String[] args) {
        int stack [] = new int [5];
        int top = -1; 
        System.out.println(isEmpty(top));
        top = push(stack, top , 10);
        top = push(stack, top, 20);
        top = push(stack, top, 30);
        top = push(stack, top, 40);
        top = push(stack, top, 50);
        top = pop(stack, top);
        System.out.println(peek(stack, top));
        System.out.println(isEmpty(top));
    }
    public static int push(int stack [] , int top , int value){
        if(top == stack.length-1){
            System.out.println("Stack is overflow");
            return top;
        }
        top++;
        stack[top] = value;
        return top;
    }
    public static int pop(int stack [] , int top){
        System.out.println(stack[top] + " is poped");
        top--;
        return top;
    }
    public static int peek(int stack [] , int top){
        return stack[top];
    }
    public static boolean isEmpty(int top){
        if(top == -1){
            return true;
        }
        return false;
    }
}