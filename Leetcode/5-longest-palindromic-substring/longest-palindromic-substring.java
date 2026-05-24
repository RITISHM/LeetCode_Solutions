class Solution {
    String ans ="";

    public void expand (String str, int start ,int end){
        if (start<0|| end==str.length()||str.charAt(start)!=str.charAt(end))return ;
        if ((end -start)+1>ans.length())ans =str.substring(start,end+1);
        expand(str,start-1,end+1);
    }


    public String longestPalindrome(String s) {
        int len=s.length();
        for(int i=0;i<len;i++){
            expand(s,i,i+1);
            expand(s,i,i);
        }
       
      
        return ans;

    }
}