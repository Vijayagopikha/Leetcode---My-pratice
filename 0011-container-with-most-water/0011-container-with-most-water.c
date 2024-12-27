int maxArea(int* height, int heightSize) {
    int  l = heightSize;
int max=0;    int left = 0;
    int r = l-1;
    while(left<r){
        int area  = (r-left)*((height[left]<height[r])?height[left]:height[r]);
        if(max<area){
            max = area;

        }
        if(height[left]<height[r]){
            left++;
        }
        else{
            r--;
        }
    }
    return max;
}