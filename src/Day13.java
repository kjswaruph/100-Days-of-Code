import java.util.Arrays;

public class Day13 {
    public static void main(String[] args) {

    }
    public static String arrangeString(String s){
        //code here.
        StringBuilder ans = new StringBuilder ();
        char arr[] = s.toCharArray();
        Arrays.sort(arr);
        int n = arr.length;
        int sum = 0;
        if(n==1){
            return s;
        }
        for(int i=0; i<n; i++){
            char ch=arr[i];
            if(ch>='A' && ch<='Z'){
                ans.append(ch);
            }
            if(ch>='0' && ch<='9'){
                sum += Character.getNumericValue(ch);
            }
        }
        ans.append(sum);
        return ans.toString();
    }
}
