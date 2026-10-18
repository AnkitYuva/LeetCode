class Solution {
    public int sumCounts(int[] nums) {
        int n = nums.length, size = (int) Math.sqrt(n) + 1;
        int[] last = new int[100001];
        int[] count = new int[n], lazy = new int[size];
        long[] sum = new long[size];
        long total = 0, squares = 0;

        for (int i = 0; i < n; i++) {
            int start = last[nums[i]];

            while (start <= i) {
                int block = start / size;

                if (start % size == 0 && start + size <= i + 1) {
                    squares += 2 * sum[block] + size;
                    sum[block] += size;
                    lazy[block]++;
                    start += size;
                } else {
                    squares += 2L * (count[start] + lazy[block]) + 1;
                    count[start]++;
                    sum[block]++;
                    start++;
                }
            }

            last[nums[i]] = i + 1;
            total = (total + squares) % 1_000_000_007;
        }

        return (int) total;
    }
}