class Solution {
   /* public int largest(int a){
    int l = 0;
    while(a!=0){
        int d = a%10;
        if(d>l){
            l = d;
        }
        a/=10;
    }
    return l;
    }
    public int small(int n){
        int s = 9;
        while(n!=0){
            int d = n%10;
            if(d<s){
                s=d;
            }
            n/=10;
        }
        return s;
    }
    public String largestNumber(int[] nums) {   
        int n = nums.length; 
      for(int i=0;i<n-1;i++){
         int l1 = largest(nums[i]);
        for(int j = i+1;j<n;j++){
            int l2 = largest(nums[j]);
        if(l1 < l2){
           
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
        if(l1 == l2){
            if(small(nums[i])>small(nums[j])){
                System.out.println(nums[i]);
                 System.out.println(nums[j]);
                 int t = nums[i];
                 nums[i] = nums[j];
                 nums[j] = t;
            }
        }
        }
       
    }
    StringBuilder s = new StringBuilder();
    for(int i=0;i<n;i++){
        s.append(nums[i]);
    }
    return s.toString();
    
}*/
public String largestNumber(int[] nums) {
        String[] array =  new String[nums.length];
        for(int i=0; i<nums.length; i++){
            array[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(array,(a,b)-> (b+a).compareTo(a+b));
        if(array[0].equals("0")){
            return "0";
        }
        StringBuilder largest = new StringBuilder();
        for(int i=0; i<array.length; i++){
            largest.append(array[i]);
        }
        return largest.toString();
    }
}