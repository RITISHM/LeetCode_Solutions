
class Solution {

    public static void solve(HashSet<List<Integer>> ans,int []nums,int index){
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

    public List<List<Integer>> permuteUnique(int[] nums) {
        HashSet<List<Integer>> ans = new HashSet<>();
        solve(ans,nums,0);
        List<List<Integer>> res=new ArrayList<>();
        for (List<Integer> i : ans)res.add(i);
        return res;
    }

}