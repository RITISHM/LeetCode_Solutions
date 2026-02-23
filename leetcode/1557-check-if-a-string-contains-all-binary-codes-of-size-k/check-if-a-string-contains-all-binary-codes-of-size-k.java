import java.util.*;
class Solution {
    public boolean hasAllCodes(String s, int k) {
       HashSet <String> set=new HashSet();
       int n=(int)(Math.pow(2,k));
       int sindex=0;
       int slen=s.length();
       for (int i=k;i<slen+1;i++){
            String str=s.substring(sindex++,i);
            if (set.contains(str))continue;
            set.add(str);
            if (set.size()==n)return true;
       } 
       
            if (set.size()==n)return true;
            return false ;

    }
}