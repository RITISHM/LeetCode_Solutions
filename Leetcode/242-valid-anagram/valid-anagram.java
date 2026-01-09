import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())return false;
        HashMap <Character,Integer>first=new HashMap<>();
        HashMap <Character,Integer>sec=new HashMap<>();

        for (int i=0;i<s.length();i++){
            first.put(s.charAt(i),1+first.getOrDefault(s.charAt(i),0));
            sec.put(t.charAt(i),1+sec.getOrDefault(t.charAt(i),0));
        }
       for (char c : first.keySet()) {
    if (!first.get(c).equals(sec.getOrDefault(c, 0))) return false;
}
        return true;
    }
}