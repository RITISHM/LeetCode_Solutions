class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int ans =0;
        while(right>left){
            if (height[left]<height[right]){
                int a =height[left]*(right-left);
                if (a>ans)ans=a;
                left++;
                continue;
            }
            int a =height[right]*(right-left);
            if (a>ans)ans=a;
            right--;
        }
        return ans;
    }
}