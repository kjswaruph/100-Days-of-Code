import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

// Nth node from end of linked list
public class Day15 {
    public static void main(String[] args) {

    }
//    public static int getNthfromLast(Node node, int n){
//
////        Node temp=head;
////        int count=0;
////        while(temp!=null){
////            count++;
////            temp=temp.next;
////        }
////        if(count<n) {
////            return -1;
////        } else{
////            int length=count-n;
////            int i=0;
////            while(i<length){
////                head=head.next;
////                i++;
////            }
////        }
////        return head.data;
//        }
}
class LinkedList<I extends Number> implements Queue<Long> {
    Node head;

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Long> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return null;
    }

    @Override
    public boolean add(Long aLong) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Long> collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean offer(Long aLong) {
        return false;
    }

    @Override
    public Long remove() {
        return null;
    }

    @Override
    public Long poll() {
        return null;
    }

    @Override
    public Long element() {
        return null;
    }

    @Override
    public Long peek() {
        return null;
    }

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
