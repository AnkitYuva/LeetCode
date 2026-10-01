// Solution 1
// class Solution {
//     public int climbStairs(int n) {
//         int a=1,b=2,c=0;
//         if(n<=2){
//             return n;
//         }
//         for(int i=3;i<=n;i++){
//             c=a+b;
//             a=b;
//             b=c;
//         }
//     return b;
//     }
// }


// Solution 2 using recusrion 
// class Solution {
//     public int climbStairs(int n) {
//         if(n <= 2) return n;
//         return climbStairs(n-1) + climbStairs(n-2);
//     }
// }


// Solution 3 using Dp Memoization
class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return helper(dp,n);
    }
    public int helper(int[] dp,int n){
        if(n == 1 || n == 2){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = helper(dp,n-1) + helper(dp,n-2);
    }
}

