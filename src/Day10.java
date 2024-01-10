import java.util.Arrays;

public class Day10 {
    public static void main(String[] args) {

    }
    public static boolean isAnagram(String a,String b)
    {
        int count=0;
        char t[]= a.toCharArray();
        char p[]= b.toCharArray();
        Arrays.sort(t);
        Arrays.sort(p);
        if(a.length()!=b.length()){
            return false;
        }
        for(int i=0;i<a.length();i++){
            if(t[i]==p[i])
            {
                count++;
            }
        }
        if(count==a.length()){
            return true;
        }else {
            return false;
        }
    }
}
