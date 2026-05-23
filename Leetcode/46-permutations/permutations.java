class Solution {
    public void solve(int []nums,int index, List<List<Integer>> res){
        if (index==nums.length){
            List<Integer>l= new ArrayList<>();
            for (int i:nums)l.add(i);
            res.add(l);
            return ;
        }

        for (int i=index ; i<nums.length; i++){
            nums=swap(nums,index,i);
            solve(nums,index+1, res);
            nums=swap(nums,index,i);
        }

    } 
    int [] swap(int[]nums,int x,int y){
        if (x==y)return nums ;
        int temp=nums[x];
        nums[x]=nums[y];
       nums[y]=temp;
        return nums;
    }
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> res=new ArrayList<>();
        solve (nums,0,res);
        return res;
    }
}