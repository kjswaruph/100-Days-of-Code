import java.util.*;

import static java.util.Arrays.sort;

public class Day3 {
    public static void main(String[] args) {
        int[] a = {4, 3, 7, 8, 6, 2, 1};
        System.out.println(Arrays.toString(zigZag(a, a.length)));
        long[] b = new long[3];

    }
//    public static int Maximize(int[] arr, int n){
//        sort(arr, arr + n);
//        long long ans = 0;
//        int mod = 1e9 + 7;
//
//        for(int i = 0;i < n;i++){
//            ans += static_cast<long long>(arr[i]) * i;
//        }
//
//        return ans % mod;
//    }
    public static long[] productExceptSelf(int nums[], int n)
    {
        // code here
        long[] left = new long[n];
        long[] right = new long[n];
        long[] P = new long[n];
        left[0] = 1;
        for(int i = 1; i<n; i++){
            left[i] = left[i-1]*nums[i-1];
        }
        right[n-1] = 1;
        for(int i = n-2 ; i>=0 ; i--){
            right[i] = right[i+1]*nums[i+1];
        }
        for(int i = 0 ; i<n ; i++){
            P[i]=left[i]*right[i];
        }
        return P;
    }
    public static int[] zigZag(int a[], int n){
        for(int i = 0; i<n-1; i++){
            if(i%2==0){
                if(a[i]<a[i+1]){
                    continue;
                }
                swap(a, i, i+1);
            }else{
                if(a[i]>a[i+1]){
                    continue;
                }
                swap(a, i, i+1);
            }
        }
        return a;
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
