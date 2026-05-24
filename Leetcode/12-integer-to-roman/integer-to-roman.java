class Solution {
    public String intToRoman(int num) {
        StringBuilder sb =new StringBuilder();
       
        int i=12;
        int []nums={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[]roman={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        while (num>0){
            while (num>=nums[i]){
                sb.append(roman[i]);
                num-=nums[i];
            }
            i--;
        }
        return sb.toString();
    }
}