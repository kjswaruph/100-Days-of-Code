import java.util.Arrays;

public class Day17 {
    public static void main(String[] args) {
        int[] a = {1, 2, 2, 4};
        System.out.println(Arrays.toString(findErrorNums(a)));
    }
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2];
        Arrays.sort(nums);
        // Find the duplicate number
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                ans[0] = nums[i];
                break;
            }
        }
        // Find the missing number
        int expectedSum = n * (n + 1) / 2;
        int actualSum = Arrays.stream(nums).sum();
        ans[1] = expectedSum - (actualSum - ans[0]);
        return ans;
    }
}
