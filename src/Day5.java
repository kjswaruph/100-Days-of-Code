import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Day5 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 9};
        System.out.println(unvisitedLeaves(3, 11,arr));
        }
    public static int minJumps(int[] arr){
        int j = 0;
        int count =0;
        for (int i = 0; i < arr.length  ; i++) {
            int max = j;
            if(j== arr.length-1){
                break;
            }
            if(i==j){
                j = arr[j] + j;
                count = count+1;
                continue;
            }
            max = Math.max(arr[i], j);
            j = max;
        }
        return count;
//        int max=0;
//        int j=0;
//        int jumps=0;
//        int n = arr.length;
//        if(n==1){
//            return 0;
//        }
//        if(arr[0]==0){
//            return -1;
//        }
//        for(int i=0;i<n;i++){
//            max=Math.max(max,i+arr[i]);
//            if(i==j){
//                j=max;
//                jumps++;
//                if(j>=n-1){
//                    return jumps;
//                }
//            }
//        }
//        return -1;
    }
    public static int unvisitedLeaves(int N, int leaves, int frogs[]) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < leaves; i++) {
            a.add(0);
        }
        for(int i = 0; i<frogs.length; i++){
            for(int j = 0; j<leaves; j++){
                if((j+1)%frogs[i]==0 ){
                    a.set(j, 1);
                }
            }
        }
        int ans = Collections.frequency(a, 0);
        return ans;
    }
}

