import java.util.ArrayList;
import java.util.Arrays;
import java.util.Queue;

public class Day16 {
    public static void main(String[] args) {
        long[] A = {-8, 2, 3, -6, 10};
        System.out.println(Arrays.toString(printFirstNegativeInteger(A, 5, 2)));
    }
//    public void mergeAlt(Node head1, Node head2){
        //write your code here, and print the result
//        Node p1 = head1;
//        Node p2 = head2;
//        Node prev = null;
//        while (p1 != null && p2 != null) {
//            prev = p2;
//            Node a1 = p1.next;
//            Node a2 = p2.next;
//            p1.next = p2;
//            p2.next = a1;
//            p1 = a1;
//            p2 = a2;
//        }
//        Node temp = head1;
//        while (temp != null) {
//            System.out.print(temp.val + " ");
//            temp = temp.next;
//        }
//        System.out.println();
//        temp = p2;
//        while (temp != null) {
//            System.out.print(temp.val + " ");
//            temp = temp.next;
//        }
//    }
    public static long[] printFirstNegativeInteger(long[] A, int N, int K){
        ArrayList<Long> list  = new ArrayList<>();
        Queue<Long> q = new LinkedList<Number>();
        for( int i=0; i<K-1; i++){
            if(A[i] <0){
                q.add(A[i]);
            }

        }
        for( int i=K-1 ; i<A.length; i++) {
            if(A[i] <0){
                q.add(A[i]);

            }
            if(!q.isEmpty()){
                list.add(q.peek());
                if(A[i -K + 1] == q.peek()){
                    q.poll();
                }

            }
            else {
                Long l = new Long(0);
                list.add(l);
            }
        }
        long ans[] = new long[list.size()];
        for( int i=0; i<list.size(); i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}
