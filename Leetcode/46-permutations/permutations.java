
class Solution {

    public static void solve(List<List<Integer>> ans,int []nums,int index){
        if (index==nums.length-1){
         List<Integer> temp=new ArrayList<>();
         for (int element:nums)temp.add(element);
         ans.add(new ArrayList<>(temp));
         return;
        }
        for (int i=index;i<nums.length;i++){
            swap(nums,i,index);
            solve(ans,nums,index+1);
            swap(nums,i,index);

        }
        
    }
    public static void swap(int [] nums,int i,int index){
        int temp=nums[i];
            nums[i]=nums[index];
            nums[index]=temp;
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(ans,nums,0);
        return ans ;
    }

}