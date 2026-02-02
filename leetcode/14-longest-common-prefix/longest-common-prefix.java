class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        for (char ch : strs[0].toCharArray()){
            for (int j=1;j<strs.length;j++){
                if (strs[j].length()<=i)return sb.toString();
                if (strs[j].charAt(i)!=ch)return sb.toString();
            }
            sb.append(strs[0].charAt(i++));
        }
        return sb.toString();
    }
}