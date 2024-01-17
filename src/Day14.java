public class Day14 {
    public static void main(String[] args) {

    }
    public static int longestSubString(String S){
        String str="";
        int count=0;
        int max=0;
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(str.contains(ch+""))
            {
                if(count>max)
                {
                    max=count;
                }
                int index=str.indexOf(ch+"");
                str=str.substring(index+1)+ch;
                count=str.length();
            }
            else
            {
                count++;
                str+=ch;
            }
        }
        if(count>max)
        {
            return count;
        }
        return max;
    }
}
