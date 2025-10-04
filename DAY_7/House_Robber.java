import java.util.Arrays;

public class House_Robber {
     public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);

        return ways(0,nums,dp);
    }

    public int ways(int i,int[] nums,int[] dp) {
        if(i>=nums.length) return 0;
        // int n = nums.length;
        if(dp[i]!=-1) return dp[i];

        int pick = nums[i]+ways(i+2,nums,dp);
        int skip = ways(i+1,nums,dp);

        return dp[i] = Math.max(pick,skip);
    }
    
}
