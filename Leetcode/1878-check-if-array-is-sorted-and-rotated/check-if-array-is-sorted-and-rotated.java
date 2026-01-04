class Solution {
    public boolean check(int[] nums) {
        if (nums.length==1)return true;
        for (int i=0;i<nums.length-1;i++){
            if (nums[i]>nums[i+1]){
                if (nums[0]>=nums[nums.length-1]){
                    for(int j=i+1;j<nums.length-1;j++){
                        if (nums[j]>nums[j+1])return false;
                    }
                    break;      
                }
                else return false;
            }
        }
        return true;
    }
}