import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

// Remove duplicates from sorted array
// Minimum distance between two numbers
public class Day4 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 0, 0, 4};
        System.out.println(Arrays.toString(pushZerosToEnd(arr, arr.length)));

    }
    public static int removeDuplicates(int[] arr, int n){
        int ans = 1;
        for (int i = 1;i < n; i++) {
            if (arr[i] != arr[i-1]) {
                arr[ans] = arr[i];
                ans++;
            }
        }
        return ans;
    }

    public static int minDist(int[] a, int x, int y){
        int left = 0;
        int right = 0;
        int ans=0;
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < a.length; i++) {
            if(a[i]==x){
                left = i;
            }
            if(a[i]==y){
                right=i;
            }
            if(a[i]!=x && a[i]!=y){
                return -1;
            }
            ans = right-left;
            b.add(ans);
        }
        Collections.sort(b);
        b.remove(0);
        ans = b.get(0);
        return ans;
    }
    public static long seriesSum(int n){
        return n*(n+1)/2;
    }
    public static int SumofAP(int n, int a, int d) {
        int sum = (n * (2 * a + (n - 1) * d)) / 2;
        return sum;
    }
    public static int[] pushZerosToEnd(int[] arr, int n){
        int left = 0;
        int right = 1;
        while(right<arr.length) {
            if (arr[left] == 0 && arr[right] != 0) {
                swap(arr, left, right);
                left++;
            } else if (arr[left] != 0){
                left++;
            }
            right++;
        }
        return arr;
    }
    public static void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}