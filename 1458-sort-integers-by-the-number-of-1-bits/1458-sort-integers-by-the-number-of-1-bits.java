

class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] arrObj = Arrays.stream(arr).boxed().toArray(Integer[]::new); // Convert int[] to Integer[]
        
        Arrays.sort(arrObj, (a, b) -> {
            int cA = Integer.bitCount(a);  // Count 1s in binary of 'a'
            int cB = Integer.bitCount(b);  // Count 1s in binary of 'b'

            if (cA == cB) {
                return a - b;  // If same count of 1s, sort by value
            }
            return cA - cB;  // Otherwise, sort by 1s count
        });

        return Arrays.stream(arrObj).mapToInt(i -> i).toArray(); // Convert Integer[] back to int[]
    }
}
