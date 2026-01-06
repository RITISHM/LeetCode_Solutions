class Solution {
    public int majorityElement(int[] nums) {
        int element=nums[0];
        int count =1;
        for (int i=1;i<nums.length;i++){
            if (count ==0){
                element =nums[i];
                count++;
            }
            else if (nums[i]!=element){
                count --;
                if (count==0)element=-1;
            }
            else count ++;
        }
        return element;
    }
}