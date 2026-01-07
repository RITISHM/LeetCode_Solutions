import java.util.HashSet;
class Solution {
    public int longestConsecutive(int[] nums) {
        int max=0;
        int len=0;
        HashSet <Integer> set=new HashSet<>();
        for (int i:nums)set.add(i);

        for (int i:set){
            if (set.contains(i-1))continue;
            int cur=i;
            len =1;
            while(set.contains(++cur))len++;
            max=Math.max(len,max);
        }
        return max;
    }
}