import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        HashSet <Integer> st=new HashSet<>();
        int i;
        for (i=0;i<nums.length;i++)st.add(nums[i]);
        for (i=0;i<nums.length;i++){
            if (!st.contains(i))return i;
        }
        return i;
    }
}