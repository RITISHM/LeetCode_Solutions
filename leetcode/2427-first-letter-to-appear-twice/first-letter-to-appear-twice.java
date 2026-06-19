class Solution {
    public char repeatedCharacter(String s) {
        int [] alpha=new int [26];
        char res=' ';
        for (char c: s.toCharArray()){
            if (alpha[c-'a']==1){
                res=c;
                break;
            }
            alpha[c-'a']=1;
        }
        return res;
    }
}