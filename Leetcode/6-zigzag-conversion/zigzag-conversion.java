class Solution {
    public String convert(String s, int numRows) {
        if (numRows==1)return s;
        StringBuilder []rows=new StringBuilder[numRows];
        for (int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int row=0;
        boolean reverse=true;
        for(int i=0;i<s.length();i++){
            rows[row].append(s.charAt(i));
            if (row+1 ==numRows||row-1<0)reverse=!reverse;
            if (reverse)row--;
            else row++;
        }
        StringBuilder ans=new StringBuilder();
        for(StringBuilder i: rows)ans.append(i);
        return ans.toString();
    }
}