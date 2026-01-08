import java.util.*;
class Solution {
    public int missingNumber(int[] nums) {
        HashSet <Integer> st=new HashSet<>();
        int i;
        int a=0;
        for (i=0;i<nums.length;i++)a=a^nums[i];
        for (i=0;i<=nums.length;i++){
            a=a^i;
        }
        return a;
    }
}