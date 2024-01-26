public class Day12 {
    public static void main(String[] args) {
        String ans = "as";

    }
    public static String encode(String str){
        StringBuilder ans = new StringBuilder();
        int count=0;
        char c=str.charAt(0);
        char ch='\0';
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==c){
                count++;
            }
            else{
                ans.append(c);
                ans.append(count);
                c=str.charAt(i);
                count=1;
            }
            ch=str.charAt(i);
        }
        ans.append(ch);
        ans.append(count);
        return ans.toString();
    }
}
