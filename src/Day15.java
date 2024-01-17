// Nth node from end of linked list
public class Day15 {
    public static void main(String[] args) {

    }
    public static int getNthfromLast(Node node, int n){

        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        if(count<n) {
            return -1;
        } else{
            int length=count-n;
            int i=0;
            while(i<length){
                head=head.next;
                i++;
            }
        }
        return head.data;
        }
    }



}
class LinkedList{
    Node head;
    public class Node{
        public int value;
        public Node next;
        public Node(int data){
            this.value = data;
        }
        public Node(Node node, int data){
            this.next = node;
            this.value = data;
        }
    }
}
