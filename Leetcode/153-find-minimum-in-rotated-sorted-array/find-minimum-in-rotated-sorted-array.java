class Solution {
    public int findMin(int[] nums) {
        int left=0;
        int right =nums.length -1;
        while (left <right ){
            int mid =left+(right -left)/2;
            if(nums[left]<=nums[mid]){
                if (nums [left]<nums [right])right =mid -1;
                else left =mid +1;
            }
            else {
                if (nums [mid]<nums[right])right =mid ;
                else 
                left =mid ;
            }
        }
        return nums [left];
    }
}