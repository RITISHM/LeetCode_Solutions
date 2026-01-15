class Solution {
    public int reverse(int x) {
        long i=0;
        while (x!=0){
            i=i*10+x%10;
            x=x/10;
        }
if (i< -Math.pow(2, 31) || i > Math.pow(2, 31) - 1) {
    return 0; // out of range
}       
        return (int )i;
    }
}