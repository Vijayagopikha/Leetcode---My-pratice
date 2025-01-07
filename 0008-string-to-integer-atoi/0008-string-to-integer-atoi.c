int myAtoi(char* s) {
    int i =0;
    int sign = 1;
    int r = 0;
     while(isspace(s[i])){
        i++;
     }
     if(s[i]=='-' || s[i]=='+'){
        sign = (s[i]=='-')? -1: 1;
        i++;
     }
    
     while(isdigit(s[i])){
        int d = s[i] - '0';
        if(r > (INT_MAX-d)/10){
            return (sign==1)? INT_MAX:INT_MIN;
        }
        r = r*10 + d;
        i++;
     }
     return r*sign;
}