class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        for(char ch : words[0].toCharArray()){
            boolean valid = true;
            for(int i = 1; i < words.length; i++){
                if(words[i].indexOf(ch) == -1){
                    valid = false;
                    break;
                }
            }
            if(valid){
                String str = String.valueOf(ch);
                list.add(str);
                for(int i = 1; i < words.length; i++){
                    words[i] = words[i].replaceFirst(str,"");
                }
            }
        }
        return list;
    }
}