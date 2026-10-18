class Solution {
    long MOD = 1_000_000_007;
    long[][] comb;
    public int numOfWays(int[] nums) {
        int n = nums.length;
        comb = new long[n][n];

        for(int i = 0; i < n; i++){
            comb[i][0] =  comb[i][i] = 1;
            for(int j = 1; j < i; j++){
                comb[i][j] = (comb[i-1][j-1] + comb[i-1][j]) % MOD;
            }
        }

        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            list.add(num);
        }

        return (int)((solve(list) - 1 + MOD) % MOD);
    }
    int solve(List<Integer> list){
        if(list.size() <= 2){
            return 1;
        }

        int n = list.size();
        int root = list.get(0);

        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for(int i = 1; i < list.size(); i++){
            if(list.get(i) < root){
                left.add(list.get(i));
            }else{
                right.add(list.get(i));
            }
        }

        long x = solve(left) % MOD; 
        long y = solve(right) % MOD; 
        long z = comb[n-1][left.size()];

        return (int)(((x * y) % MOD * z) % MOD);
    }
}