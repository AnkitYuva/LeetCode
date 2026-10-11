class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        
        if(digits.isEmpty()){
            return res;
        }

        Map<Character,String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        res.add("");

        for(int i = 0; i < digits.length(); i++){
            List<String> temp = new ArrayList<>();

            String letter = map.get(digits.charAt(i));

            for(int j = 0; j < res.size(); j++){
                for(int k = 0; k < letter.length(); k++){

                    temp.add(res.get(j) + letter.charAt(k));
                }
            }
            res = temp;
        }
        return res;
    }
}