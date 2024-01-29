import java.util.Locale;
import java.util.Stack;

public class Day20 {
    public static void main(String[] args) {
        String S = "aaABBb";
        System.out.println(transform(S));
    }
    public static String transform(String S){
        StringBuilder ans = new StringBuilder();
        String lowerCase = S.toLowerCase();
        Stack<Character> stack = new Stack<>();
        stack.push(lowerCase.charAt(0));
        int count = 1;
        for(int i = 1;i<lowerCase.length();i++){
           if(stack.peek()==lowerCase.charAt(i)){
               count++;
           }
           else{
               ans.append(count);
               ans.append(stack.peek());
               stack.push(lowerCase.charAt(i));
               count = 1;
               
           }
        }
        ans.append(count);
        ans.append(stack.peek());
        return ans.toString();
    }
}
