import java.util.Stack;

public class Day19 {
    public static void main(String[] args) {
        String path = "/home//foo/";
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] arr = path.split("/");
        String ans = "";
        for(int i=0;i<arr.length;i++) {
            if(!stack.isEmpty()&& arr[i].equals("..") )
                stack.pop();
            else if(!arr[i].isEmpty() &&!arr[i].equals(".")&& !arr[i].equals(".."))
                {stack.push(arr[i]);}
            }
        if(stack.isEmpty()) {
            return "/";
        }
        while(!stack.isEmpty()) {
            ans="/" + stack.pop()+ans;
        }
        return ans;
    }
}
