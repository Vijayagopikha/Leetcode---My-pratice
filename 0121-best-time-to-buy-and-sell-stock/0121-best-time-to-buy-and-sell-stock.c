/*int maxProfit(int* prices, int l) {
    int arr[50];
    int k=0;
    for(int i=0;i<l-1;i++){
        for(int j=i+1;j<l;j++){
            if(prices[i]<prices[j]){
                arr[k++]=prices[j]-prices[i];
            }
        }
    }
    int max=arr[0];
    for(int i=1;i<l;i++){
        
            if(arr[i]>max){
                max=arr[i];
            }
        
    }
    return max;
}*/
int maxProfit(int* prices, int l) {
   /* if (l == 0) return 0;

    int minPrice = prices[0];
    int maxProfit = 0;

    for (int i = 1; i < l; i++) {
        if (prices[i] < minPrice) {
            minPrice = prices[i];
        } else if (prices[i] - minPrice > maxProfit) {
            maxProfit = prices[i] - minPrice;
        }
    }

    return maxProfit;*/
   /* int max=0;
    for(int i=0;i<l-1;i++){
        for(int j=i+1;j<l;j++){
             int cur = prices[j]-prices[i];
             if(max<cur){
                max=cur;
             }
        }
    }
    return max;*/
    int max = 0 , cur = 0, min = INT_MAX;
    for(int i=0;i<l;i++){
        min = fmin(prices[i],min);
        cur = prices[i]-min;
        max = fmax(cur,max);
    }
    return max;
}
