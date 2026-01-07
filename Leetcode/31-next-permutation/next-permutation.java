class Solution {
    public void reverseFrom(int start,int []nums){
        int j=nums.length-1;
        for (int i=start;i<start+(nums.length-start)/2;i++){
            int temp=nums[j];
            nums[j--]=nums[i];
            nums[i]=temp;
        }
    }
    public void nextPermutation(int[] nums) {
        int bp=-1;
        for(int i=nums.length-2;i>=0;i--){
            if (nums[i]<nums[i+1]){
                bp=i;
                break;
            }
        }
        if (bp==-1){
            reverseFrom(0,nums);
            return;
        }

        int sbp=0;
        for(int i=nums.length-1;i>=0;i--){
            if (nums[i]>nums[bp]){
                sbp=i;
                break;
            }
        }
        int temp=nums[bp];
        nums[bp++]=nums[sbp];
        nums[sbp]=temp;
        reverseFrom(bp,nums);
        
    }
}