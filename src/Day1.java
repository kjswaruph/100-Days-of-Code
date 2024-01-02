// Problem 1: Find Transition Point
// Problem 2: Peak element
// Problem 3: Implement two stacks in an array
public class Day1 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15};
        
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
        for (int i = 0; i < n-1; i++) {
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
    class twoStacks
    {
        int[] arr;
        int size;
        int top1, top2;
        twoStacks()
        {
            size = 100;
            arr = new int[100];
            top1 = -1;
            top2 = size;
        }
        //Function to push an integer into the stack1.
        void push1(int x)
        {
            top1++;
            arr[top1]=x;

        }
        //Function to push an integer into the stack2.
        void push2(int x)
        {
            top2--;
            arr[top2] = x;

        }
        //Function to remove an element from top of the stack1.
        int pop1()
        {
            if(top1==-1){
                return -1;
            }
            else
                return arr[top1--];
        }
        //Function to remove an element from top of the stack2.
        int pop2()
        {
            if(top2==size) return -1;
            else return arr[top2++];

        }

    }
}
