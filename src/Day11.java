public class Day11 {
    public static void main(String[] args) {

    }
    public static boolean wifiRange(int N, String S, int X) {
        int sideElements = 0 ;
        for(int i=0 ; i<N ; i++){
            if(S.charAt(i)=='0') {
                sideElements-- ;
            }
            else{
                sideElements = X ;
            }
            if(sideElements < -1*X) {
                return false ;
            }
        }
        if(sideElements < 0) {
            return false ;
        }
        else {
            return true ;
        }
    }
}
