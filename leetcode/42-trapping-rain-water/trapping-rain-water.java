class Solution {
    public int trap(int[] height) {
        int [] nextGreatest = new int [height.length];
        int [] previousGreatest = new int [height.length];
        int currMax=0;

        for (int i = 0; i < height.length; i++){
            if (currMax <= height[i]){
                currMax = height[i];
                previousGreatest[i] = -1; 
            }
            else previousGreatest[i] = currMax; 
        }

        currMax=0;

        for (int i = height.length-1; i > -1; i--){
            if (currMax <= height[i]){
                currMax = height[i];
                nextGreatest[i] = -1; 
            }
            else nextGreatest[i] = currMax; 
        }


        int ans =0;

        for (int i = 0; i < height.length; i++ ){
            if (previousGreatest[i] == -1 || nextGreatest[i] == -1) continue;
            int smallSide= previousGreatest[i] < nextGreatest[i] ? previousGreatest[i] : nextGreatest[i];
            ans += smallSide - height[i];
        }

        return ans;
        

    }
}