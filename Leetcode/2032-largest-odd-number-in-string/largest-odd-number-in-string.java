class Solution {
    public String largestOddNumber(String num) {
        String ans ="";
        int i;
        for (i=num.length()-1;i>=0;i--){
            char c=num.charAt(i);
            if ((c-'0')%2==1){
                break;
            }
        }
        for (int j=0;j<=i;j++)ans+=num.charAt(j);
        return ans;
    }
}