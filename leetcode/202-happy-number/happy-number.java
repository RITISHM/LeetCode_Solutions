import java.util.*;
class Solution {
    int calculate(int n){
        int ans=0;
        while (n>0){
            ans+=(n%10)*(n%10);
            n=n/10;
        }
        return ans ;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet();
        while (!set.contains(n)){
            if (n==1){
                return true;
            }
            set.add(n);
            n=calculate(n);
            
        }
        return false;
    }
}