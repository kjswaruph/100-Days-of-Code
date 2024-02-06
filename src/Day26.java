public class Day26 {
    public static void linkdelete(Node head, int M, int N) {
        // your code here
        Node temp = head;
        Node node = new Node(-1);
        Node ans = node;
        int j = 1;
        while(temp != null){
            if(j <= M){
                ans.next = temp;
                ans = ans.next;
                temp = temp.next;
                j++;
            }
            else{
                for(int i = 1; i <= N; i++){
                    if(temp == null){
                        break;
                    }
                    temp = temp.next;
                }
                j = 1;
            }
        }
        ans.next = null;
        head = node.next;
    }
}
