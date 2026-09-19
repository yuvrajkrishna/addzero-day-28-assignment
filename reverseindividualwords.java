public class reverseindividualwords {
    public static void main(String[] args) {
        String str = "Hello How Are You";
        char stack[] = new char[str.length()];
        int top = -1;
        for(int i = 0 ; i < str.length() ; i++){
            top = push(stack, str, top);
        }
        wordrev(stack, top);

    }
    public static int push (char stack [] , String str , int top){
        top++;
        stack[top] = str.charAt(top);
        return top;
    }
    public static void wordrev(char stack[], int top) {

        int i = 0;
        int j = i;

        while (j <= top) {

            if (stack[j] != ' ') {
                j++;
            } 
            else {

                for (int k = j - 1; k >= i; k--) {
                    System.out.print(stack[k]);
                }

                System.out.print(" ");

                i = j + 1;
                j++;
            }
        }

        // Last word
        for (int k = top; k >= i; k--) {
            System.out.print(stack[k]);
        }
    }
}
