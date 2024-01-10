import java.util.Arrays;

public class Day8 {
    public static void main(String[] args) {
        int[] a = {4, 2, 5, 7};
        int[] b = {1, 2, 3, 5};
        System.out.println(findElement(a,a.length));
    }
    public static double medianofArrays(int n, int m, int[] a, int[] b){
        int[] c = new int[a.length+ b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);
        double ans =0;
        if(c.length%2==0){
            ans = (double) (c[c.length / 2] + c[c.length / 2 - 1]) /2;
        } else {
            ans = c[c.length/2];
        }
        return ans;
    }
    public static int[] convertToWave(int n, int[] a){
        int j = 1;
        for (int i = 0; i < n-1; i=i+2) {
            if(a[i]<a[i+1]){
                swap(a, i, i+1);
            }
            if(j==n-1){
                continue;
            }
            if (a[j]>a[j+1] && j<n){
                swap(a, j, j+1);
            }
        }
        return a;
    }
    public static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
    public static int findElement(int arr[], int n){
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        leftMax[0] = arr[0];
        rightMax[n-1] = arr[n-1];

        int l = arr[0];
        for (int i = 1; i<n; i++){
            if (arr[i]>l) {
                l = arr[i];
            }
            leftMax[i] = l;
        }

        int s = arr[n-1];
        for (int i = n-2; i>=0; i--){
            if (arr[i]<s) {
                s = arr[i];
            }
            rightMax[i] = s;
        }
        for (int i = 1; i<n-1; i++){
            if (rightMax[i] == leftMax[i]) {
                return rightMax[i];
            }
        }
        return -1;
    }
}
