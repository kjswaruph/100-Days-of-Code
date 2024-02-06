//public class Day23 {
//    public static float findMedian(Node root) {
//        // code here.
//        int count = 0;
//        int n = countNodes(root);
//        if (n % 2 == 0) {
//            int first = kthSmallest(root, n / 2);
//            int second = kthSmallest(root, n / 2 + 1);
//            return (first + second) / 2.0f;
//        } else {
//            return kthSmallest(root, (n + 1) / 2);
//        }
//    }
//
//    public static int countNodes(Node root) {
//        if (root == null){
//            return 0;
//        }
//        return 1 + countNodes(root.left) + countNodes(root.right);
//    }
//    public static int kthSmallest(Node root, int k) {
//        if (root == null) {
//            return -1;
//        }
//        int leftCount = countNodes(root.left);
//        if (leftCount == k - 1) {
//            return root.data;
//        } else if (leftCount >= k) {
//            return kthSmallest(root.left, k);
//        } else {
//            return kthSmallest(root.right, k - leftCount - 1);
//        }
//    }
//}
