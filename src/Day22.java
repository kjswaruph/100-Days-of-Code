public class Day22 {
    public static void main(String[] args) {

    }
    public static boolean search(Node root, int x){
        while(root!=null){
            if(root.data==x){
                return true;
            }
            else if(root.data<x){
                root=root.right;
            }
            else{
                root=root.left;
            }
        }
        return false;
    }
}
