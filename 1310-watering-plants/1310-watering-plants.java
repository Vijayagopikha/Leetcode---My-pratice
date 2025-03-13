class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int c =  capacity;
        int step = 0;
        int l = plants.length;
        int i=0;
        while(i<l){
           if(plants[i]<=capacity){
            capacity-=plants[i];
            step++;
            i++;
           }
           else{
            capacity = c;
           /* for(int j=i-1;j>=0;j--){
                step++;
            }*/
            step+=i;
           
            for(int j=0;j<i;j++){
               
                step++;
            }
           
           }
           
        }
        return step;
    }
}