class Solution {
    public boolean isPerfectSquare(int num) {
        int ans =(int)Math.sqrt(num);
        return ans*ans == num;
    }
}