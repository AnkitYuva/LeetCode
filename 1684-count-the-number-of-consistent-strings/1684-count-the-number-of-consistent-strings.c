int countConsistentStrings(char * allowed, char ** words, int wordsSize){
    bool freq[26] ={false};
    for(int i = 0; allowed[i] != '\0'; i++){
        freq[allowed[i] - 'a'] = true;
    }
    int count = 0;
    for(int i = 0; i < wordsSize; i++){
        bool valid = true;
        for(int j = 0; words[i][j] != '\0'; j++){
            if(!freq[words[i][j] - 'a']){
                valid = false;
                break;
            }
        }
        if(valid){
            count++;
        }
    }
    return count;
}