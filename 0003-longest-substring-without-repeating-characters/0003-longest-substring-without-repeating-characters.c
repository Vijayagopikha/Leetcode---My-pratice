
int lengthOfLongestSubstring(char* s) {
   int n = strlen(s);
   if(n==0)return 0;
   int l=0,r=0,max=0;
   int charset[128] = {0};
   while(r<n){
    if(charset[s[r]]==0){
        charset[s[r]]++;
        r++;
        max=max>(r-l)?max:r-l;
    }
    else{
        charset[s[l]]--;
        l++;
    }
   }
   return max;
}