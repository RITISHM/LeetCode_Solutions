import java.util.*;
class Solution {
    public int singleNumber(int[] nums) {
       int ans=nums[0];
       for(int i=1;i<nums.length;){
       ans ^=nums[i++];
       }
       return ans;

    }
}