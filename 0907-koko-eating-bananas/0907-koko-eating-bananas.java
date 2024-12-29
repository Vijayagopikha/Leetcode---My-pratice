class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int  n =piles.length;
       
        
        //time limit exceed

        /*Arrays.sort(piles);
        int max = piles[n-1];*/
        int max = piles[0];
        for(int i=0;i<n;i++){
            if(max<piles[i]){
                max = piles[i];
            }
        }
        if(n==h){
            return max;
        }
        int  l = 1;
        int r = max;
        while(l<r){
            int mid = (l+r)/2;
             int sum = 0;
            for(int i : piles){
                sum+= (i/mid) + (i%mid !=0 ? 1 : 0); //ceil operatinn kaga..6.5 na 7 varanumla so.
                if(sum>h){
                    break;
                }
               
            }
            if(sum<=h){
                r = mid;
            }
            else{
                l = mid+1;
            }
        }
      /*  while(b<=max){
            int sum = 0;
            for(int i : piles){
                sum+= (i/b) + (i%b !=0 ? 1 : 0); //ceil operatinn kaga..6.5 na 7 varanumla so.
                if(sum>h){
                    break;
                }
               
            }
            if(sum<=h){
                return b;
            }
            b++;
        }*/ //tle
        

        return l;
    }
}