import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day7 {
    public static void main(String[] args) {
//        long[] car = {2, 10, 4, 7, 4, 4, 5, 3, 8};
//        long[] fine = {2, 3, 10, 6, 4, 2, 5, 2, 8};
//        System.out.println(totalfine(9, 3, car, fine));
//        int[] arr = {111, 222, 333, 444, 555};
//        System.out.println(palinArray(arr, arr.length));
        String[] g  = { "Geek", "Geeks", "Geeksfor", "GeeksforGeek", "GeeksforGeeks" };
        System.out.println(longest(g, g.length));
    }
    public static int majorityeElement(int[] a, int size){
        int target = a.length/2;
        int count = 0;
        ArrayList<Integer> array = new ArrayList<Integer>();
        for (int i = 0; i < size; i++) {
            array.add(a[i]);
        }
        for (int i = 0; i < size; i++) {
            count = Collections.frequency(array, array.get(i));
            if(count>target){
                break;
            }
        }
        return count;
    }
    public static long totalfine(long n, long date, long car[], long fine[]){
        long sum = 0;
        if(date%2==0){
            for (int i = 0; i < n; i++) {
                if(car[i]%2!=0){
                    sum = sum+fine[i];
                }
            }
        }else {
            for (int i = 0; i < n; i++) {
                if(car[i]%2==0){
                    sum = sum+fine[i];
                }
            }
        }
        return sum;
    }
    public static int maxstep(int[] A, int N){
        int count = 0;
        int max = 0;
        for (int i = 0; i < N-1; i++) {
            if(A[i]<A[i+1]){
                count++;
            }else {
                count=0;
            }
            max = Math.max(max, count);

        }
        return count;
    }
    public static long[] findElements( long a[], long n) {
        long[] b = new long[(int) (n-2)];
        Arrays.sort(a);
        for (int i = 0; i < n-2; i++) {
            b[i] = a[i];
        }
        return b;
    }
    public static int palinArray(int[] a, int n){
        int ans = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean p = palindrome(a[i]);
            if(p==true){
                count=count+1;
            }
        }
        if(count==n){
            ans = 1;
        }
        return ans;
    }
    public static boolean palindrome(int a){
        String b = String.valueOf(a);
        String ans = "";
        for (int i = b.length()-1; i >-1; i--) {
            ans = ans + b.charAt(i);
        }
        if(b.equals(ans)){
            return true;
        }else {
            return false;
        }
    }
    public static String longest(String[] names, int n){
        int max =names[0].length();
        int ans = 0;
        for(int i = 1; i<n; i++){
            if(names[i].length()>max){
                max = names[i].length();
                ans = i;
            }
        }
        return names[ans];
    }
}
