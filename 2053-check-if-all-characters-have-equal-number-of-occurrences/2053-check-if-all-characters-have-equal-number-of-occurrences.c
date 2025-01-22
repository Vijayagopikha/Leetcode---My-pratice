bool areOccurrencesEqual(char* s) {
    int freq[26];
    memset(freq,0,sizeof(freq));
    for(int i=0;s[i]!='\0';i++){
        freq[s[i]-'a']++;
    }
    int c=0;
    for(int i=0;i<26;i++){
        if(freq[i]>0){
          c=freq[i];
          break;
        }
    }
    for(int i=0;i<26;i++){
        if(freq[i]>0 && freq[i]!=c)
        {
            return false;
        }
    }
    return true;
}