int findLUSlength(char* a, char* b) {
    if(strcmp(a,b) == 0){
        return -1;
    }
    return fmax(strlen(a),strlen(b));
}