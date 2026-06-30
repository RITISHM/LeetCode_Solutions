class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length - 1;
        while(mid <= high ){
            if (nums[mid] == 0) {
                swap(mid, low, nums);
                low++;
                mid++; 
            }
            else if (nums[mid] == 2){
                swap( mid, high, nums);
                high--;
            }
            else mid++ ; 
        }
    }

    void swap( int index1, int index2, int [] arr ){
        int temp = arr [index1];
        arr [index1] = arr[index2];
        arr [index2] = temp;
    }
}