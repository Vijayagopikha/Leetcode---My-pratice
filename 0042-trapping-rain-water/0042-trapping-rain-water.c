int trap(int* h, int heightSize) {
    int  l = heightSize;
    if(l<=2)return 0;
   /* int left[l];
    int right[l];
    left[0]=height[0];
    right[l-1]=height[l-1];
    
    for(int i=1;i<l;i++){
        left[i]=(height[i]>left[i-1])?height[i]:left[i-1];
    }
    for(int i = l-2;i>=0;i--){
        right[i] = (height[i]>right[i+1])?height[i]:right[i+1];
    }
    int c=0;
    for(int i=0;i<l;i++){
        c+=(left[i]<right[i])?left[i]-height[i]:right[i]-height[i];
    }
    return c;*/
    int lm = 0, rm = 0, c=0;
    int left = 0;
    int right = l-1;
   while(left<right){
        if(h[left]<h[right]){
           if(lm>h[left]){

            c+= lm-h[left] ;
            }
            else{
                lm = h[left];
            }
            left++;

        }
        else{
            if(rm>h[right]){
                c+=rm-h[right];
            }
            else{
               rm = h[right];
            }
            right--;
        }
    }
    return c;
}