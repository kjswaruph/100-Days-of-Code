//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Day22 {
//    public static void main(String[] args) {
//
//    }
//    public static ArrayList<Integer> printNearNodes(Node root,int low,int high) {
//        // code here.
//
//        ArrayList<Integer> list =new ArrayList<Integer>();
//        ArrayList<Integer> ans = new ArrayList<Integer>();
//        inorder(root,list);
//        for(int i=0;i<list.size();i++){
//            if(list.get(i)>=low && list.get(i)<=high){
//                ans.add(list.get(i));
//            }
//        }
//        Collections.sort(ans);
//        return ans;
//    }
//
//    public static void inorder(Node root,ArrayList<Integer> list){
//        if(root==null)return;
//        inorder(root.left,list);
//        list.add(root.data);
//        inorder(root.right,list);
//    }
//}
