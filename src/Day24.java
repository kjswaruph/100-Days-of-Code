public class Day24 {
    class Node {
        int key;
        Node left, right;
    
        Node(int x) {
            key = x;
            left = right = null;
        }
    }
    public static void main(String[] args) {
        int n = 24;
//        System.out.println(findMaxForN());
    }
    public static int findMaxForN(Node node, int val)
   {
       if(node == null){
           return -1;
       }
       if(node.key == val){
           return node.key;
       }
       else if(val > node.key){
           int max = findMaxForN(node.right, val);
           if(max != -1){
               return max;
           }else{
               return node.key;
           }
       }
       else if(val < node.key){
           int max = findMaxForN(node.left, val);
           return max;
       }
       return -1;
   }
}
