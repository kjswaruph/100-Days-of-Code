// Problem 1: Find Transition Point
// Problem 2: Peak element
public class Day1 {
    public static void main(String[] args) {
        int[] arr = {5, 1, 2, 3, 4};
        System.out.println(findKRotation(arr, arr.length));
    }
    public static int transitionPoint(int arr[], int n){
        int index=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==1){
                index = i+1;
                break;
            }
            index = -1;
        }
        return index;
    }
    public static int peakElement(int[] arr, int n){
        int ans = 0;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            ans = arr[i-1];
            if(max>ans){
                ans = max;
            }
            if(arr[n-1]>max)
            if (arr[i - 1] > ans && arr[i+1] > ans) {
                max = ans;
            }
        }
        return ans;
    }
    public static int findKRotation(int[] arr, int n){
        int k = -1;
        for (int i = 0; i < n; i++) {
            if(arr[i]>arr[i+1]){
                k = i+1;
                break;
            }
        }
        if(k==-1){
            return 0;
        }
        return k;
    }
}
