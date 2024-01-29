import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Day21 {
    public static void main(String[] args) {
        int[] arr = {20, 10, 25, 30, 40};
        int k = 2;
        System.out.println(deleteElement(arr, arr.length, k));
    }
    public static ArrayList<Integer> deleteElement(int[] arr, int n, int k){
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        int count = 0;
        for(int i = 1;i<n;i++){
            while(!stack.isEmpty() && arr[i]>stack.peek() && count<k){
                stack.pop();
                count++;
            }
            stack.push(arr[i]);
        }
        while(!stack.isEmpty()){
            ans.add(stack.pop());
        }
        Collections.reverse(ans);
        return ans;
    }
}
