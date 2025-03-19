class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        HashMap<List<Integer>, Integer> map = new HashMap<>();
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        for(int i = 1; i<arr.length;i++){
            int dif = arr[i] - arr[i-1];
            min = Math.min(min, dif);
        }
        for(int i= 1;i<arr.length;i++){
            int diff = arr[i]-arr[i-1];
            if(diff==min){
                res.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return res;
    }
}