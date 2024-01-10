import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day9 {
    public static void main(String[] args) {
        long[] arr = {1, 2, -3, 4, 5};
        System.out.println(maximizeSum(arr, 5, 1));
    }
    public static int kthSmallest(int[] arr, int l, int r, int k){
//        ArrayList<Integer> a = new ArrayList<Integer>();
//        int min= arr[l];
//        for (int i = l; i <= r; i++) {
//            a.add(arr[i]);
//        }
//        Collections.sort(a);
//        return a.get(k-1);
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static long maximizeSum(long a[], int n, int k) {
        Arrays.sort(a);
        int i = 0;
        while (i < n && k > 0 && a[i] < 0) {
            a[i] = -a[i];
            k--;
            i++;
        }
        if (k > 0 && k % 2 != 0) {
            Arrays.sort(a);
            a[0] = -a[0];
        }
        long sum = 0;
        for (int j = 0; j < n; j++) {
            sum += a[j];
        }
        return sum;
    }


}
