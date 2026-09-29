class Solution {
    public int numJewelsInStones(String jewels, String stones) {
//Solution 1
        // Set<Character> set = new LinkedHashSet<>();
        // for(char ch : jewels.toCharArray()){
        //     set.add(ch);
        // }
        // int count = 0;
        // for(char ch : stones.toCharArray()){
        //     if(set.contains(ch)){
        //         count++;
        //     }
        // }
        // return count;
        
// Solution 2
        boolean[] exist = new boolean[128];
        int count = 0;
        for(char ch : jewels.toCharArray()){
            exist[ch] = true;
        }
        for(char ch : stones.toCharArray()){
            if(exist[ch]){
                count++;
            }
        }
        return count;
    }
}