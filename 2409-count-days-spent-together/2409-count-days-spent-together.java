class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int astart = helper(arriveAlice);
        int aend = helper(leaveAlice);
        int bstart = helper(arriveBob);
        int bend = helper(leaveBob);

        int overlapstart = Math.max(astart,bstart);
        int overlapend = Math.min(aend,bend);

        if(overlapstart <= overlapend){
            return overlapend - overlapstart + 1;
        }
        return 0;
    }
    public int helper(String date){
        int[] dayscount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(date.substring(0,2));
        int day = Integer.parseInt(date.substring(3));
        int total = 0;
        for(int i = 0; i < month - 1; i++){
            total += dayscount[i];
        }
        total += day;
        return total;
    }
}