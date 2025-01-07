char* intToRoman(int num) {
     int n[] = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
     char* s[] = {"M", "CM","D" ,"CD","C","XC","L","XL","X","IX","V","IV","I" };
     static char r[20];
     r[0] = '\0';
     int i=0;
     while(num!=0){
        if(num>=n[i]){
            strcat(r,s[i]);
            num-=n[i];
        }
        else{
            i++;
        }
     }
     return r;
}