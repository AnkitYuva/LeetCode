// Using Recursion

// class Solution {
//     public int fib(int n) {
//         if (n <= 1){ 
//             return n;
//         }
//     return fib(n-1) + fib(n-2);
//     }
// }


// Dynamic Programming(memoization)

class Solution {
    public int fib(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return fibDP(dp,n);
    }
    public int fibDP(int[] dp,int n){
        if(n <= 1){
            return n;
        }
        if(dp[n] != -1){
            return dp[n];
        }
        return dp[n] = fibDP(dp,n-1) + fibDP(dp,n-2);
    }
}