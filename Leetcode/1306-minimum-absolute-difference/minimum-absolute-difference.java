import java.util.*;
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min =Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=1;i<arr.length;i++){
            int diff=arr[i]-arr[i-1];
                if (diff!=0&&diff<min){
                ans.clear();
                min =diff;
                List<Integer> element = new ArrayList<>();
                element.add(arr[i-1]);
                element.add(arr[i]);
                ans.add(element);
            }
            else if (diff==min){
                List<Integer> element = new ArrayList<>();
                element.add(arr[i-1]);
                element.add(arr[i]);
                ans.add(element);
            }

        }
        return ans;
    }
}