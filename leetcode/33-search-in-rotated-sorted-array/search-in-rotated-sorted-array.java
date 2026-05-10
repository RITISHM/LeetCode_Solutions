class Solution {

    static int bSearch(int [] arr, int target, int start,int end){
        if (start>end)return -1;
        int mid = start+((end-start)/2);

        if (arr[mid]==target)return mid;

        if (arr[start]<=arr[mid]){
            if (target>=arr[start]&& target<arr[mid]) return bSearch(arr,target,start,mid-1);
            else return bSearch(arr,target,mid+1,end);
        }
        if (target<=arr[end]&&target>arr[mid]) return bSearch(arr,target,mid+1,end);
        else return bSearch(arr,target,start,mid-1);
    }

    public int search(int[] nums, int target) {
        return bSearch(nums,target,0,nums.length-1);
    }
}