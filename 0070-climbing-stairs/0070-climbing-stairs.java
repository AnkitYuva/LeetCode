// Solution 1 (Both Time & Space Optimiszed)
class Solution {
    public int climbStairs(int n) {
        int a=1,b=2,c=0;
        if(n<=2){
            return n;
        }
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
    return b;
    }
}


// Solution 2 using recusrion 
// class Solution {
//     public int climbStairs(int n) {
//         if(n <= 2) return n;
//         return climbStairs(n-1) + climbStairs(n-2);
//     }
// }


// Solution 3 using Dynamic Programming Memoization
// class Solution {
//     public int climbStairs(int n) {
//         int[] dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         return helper(dp,n);
//     }
//     public int helper(int[] dp,int n){
//         if(n == 1 || n == 2){
//             return n;
//         }
//         if(dp[n] != -1){
//             return dp[n];
//         }
//         return dp[n] = helper(dp,n-1) + helper(dp,n-2);
//     }
// }


// Solution 4 using Dynamic Programing - Tabulation Method
// class Solution {
//     public int climbStairs(int n) {
//         if(n == 1) return 1;
//         int[] dp = new int[n+1];
//         dp[1] = 1;
//         dp[2] = 2;
//         for(int i = 3; i <= n; i++){
//             dp[i] = dp[i-1] + dp[i-2];
//         }
//         return dp[n];
//     }
// }

