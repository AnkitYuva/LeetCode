class Solution {
    public String[] findWords(String[] words) {
        String first = "qwertyuiop";
        String second = "asdfghjkl";
        String third = "zxcvbnm";
        List<String> list = new ArrayList<>();
        for(String word1 : words){
            String word = word1.toLowerCase();
            boolean fvalid = true;
            boolean svalid = true;
            boolean tvalid = true;
            for(int i = 0; i < word.length(); i++){
                if(first.indexOf(word.charAt(i)) == -1){
                    fvalid = false;
                }
                if(second.indexOf(word.charAt(i)) == -1){
                    svalid = false;
                }
                if(third.indexOf(word.charAt(i)) == -1){
                    tvalid = false;
                }
            }
            if(fvalid == true || svalid == true || tvalid == true){
                list.add(word1);
            }
        }
        return list.toArray(String[]::new);
    }
}