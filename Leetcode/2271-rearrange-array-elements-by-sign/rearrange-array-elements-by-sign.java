class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []positive=new int [nums.length/2];
        int []negative=new int [nums.length/2];
        int p=0,n=0;
        for (int i:nums){
            if (i<0)negative[n++]=i;
            else positive [p++]=i;
        }
        p=0;n=0;
        for (int i=0;i<nums.length;i++){
            if (i%2==0)nums[i]=positive[p++];
            else nums[i]=negative[n++];
        }
        return nums;
    }
}