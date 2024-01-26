import java.util.Arrays;
import java.util.Stack;

public class Day18 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<Integer>();
        for(int b : a){
            stack.push(b);
        }
        System.out.println(deleteMid(stack, a.length));
    }
    public static boolean isstr(String x){
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<x.length();i++){
            char c = x.charAt(i);
            if(c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else if(!stack.empty() && c ==')' && stack.peek()=='('){
                stack.pop();
            }else if(!stack.empty() && c =='}' && stack.peek()=='{'){
                stack.pop();
            }else if(!stack.empty() && c ==']' && stack.peek()=='['){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.empty();
    }
    public static Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack){
        // code here
        Stack<Integer> temp = new Stack<Integer>();
        Stack<Integer> ans = new Stack<Integer>();
        for ( int i = 0; i < sizeOfStack; i++ ) {
            temp.push(s.pop());
            if(i==sizeOfStack/2){
                temp.pop();
                continue;
            }
            return s;
        }
        return s;
    } 
}
