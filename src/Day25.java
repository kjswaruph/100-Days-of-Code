import java.util.*;
public class Day25 {
    public static void main(String[] args) {

    }
    public static int countPairs(LinkedList<Integer> head1, LinkedList<Integer> head2, int x) {
        // add your code here
        ArrayList<Integer> list1 = new ArrayList<Integer>(head1);
        ArrayList<Integer> list2 = new ArrayList<Integer>(head2);
        Collections.sort(list1);
        Collections.sort(list2);
        int i = 0;
        int j = list2.size()-1;
        int count=0;
        while(i<list1.size() && j>=0){
            if(list1.get(i)+list2.get(j)==x){
                count++;
                i++;
            }
            else if(list1.get(i)+list2.get(j)>x){
                j--;
            }
            else{
                i++;
            }
        }
        return count;
    }
}
