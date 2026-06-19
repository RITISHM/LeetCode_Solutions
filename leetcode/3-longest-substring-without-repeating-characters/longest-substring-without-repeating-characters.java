class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)return 0;
        Set <Character> set=new HashSet<>();
        int start =0;
        int res=0;
        for (int end=0;end<s.length();end++){
                        
            while (set.contains(s.charAt(end))) {
            set.remove(s.charAt(start));
            start++;    
            }
            set.add(s.charAt(end));
            res=Math.max(res,end-start+1);
        }
        return res;
    }
}