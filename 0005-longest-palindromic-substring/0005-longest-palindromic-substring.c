int palin(char s[],int i,int j){
    while(i<j){
        if(s[i]!=s[j]){
            return 0;
        }
        i++;
        j--;
    }
    return 1;
}
char* longestPalindrome(char* s) {
    int n = strlen(s);
    if(n==0)return " ";
    int start =0, max =1;
    for(int i=0;i<n;i++){
        for(int j=i;j<n;j++){
            if(j-i+1>max && palin(s,i,j)){
                start = i;
                max = j-i+1;
            }
        }
    }
    char *r = (char *)malloc(max+1);
    strncpy(r,s+start,max);
    r[max]='\0';
    return r;
}