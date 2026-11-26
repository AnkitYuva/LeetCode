class Solution {
    public boolean canAliceWin(int n) {
        int rem = 10;
        int count = 0;
        while(n >= rem){
            n -= rem;
            rem--;
            count++;
        }
        return count % 2 == 1;
    }
}