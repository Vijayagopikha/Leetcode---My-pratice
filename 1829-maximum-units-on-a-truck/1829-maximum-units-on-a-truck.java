class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
       // int col = 2;
        int row = boxTypes.length;
        int sum = 0, tot = 0;
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        for(int i=0;i<row;i++){
          // sum+=boxTypes[i][0];
           if(truckSize >= boxTypes[i][0]){
               tot += boxTypes[i][0] * boxTypes[i][1];
               truckSize-=boxTypes[i][0];
           }
           else{
            tot+= truckSize * boxTypes[i][1];
            break;
           }
        }
        //WANT TO SORT BASED ON UNITS..THAT NOT PERFORM HERE
       /* for(int i=0;i<row;i++){
          // sum+=boxTypes[i][0];
           if(truckSize >= boxTypes[i][0]){
               tot += boxTypes[i][0] * boxTypes[i][1];
               truckSize-=boxTypes[i][0];
           }
           else{
            tot+= truckSize * boxTypes[i][1];
            return tot;
           }
        }*/
        return tot;
    }
}