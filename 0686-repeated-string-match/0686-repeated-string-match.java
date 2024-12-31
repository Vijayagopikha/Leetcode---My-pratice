class Solution {
    public int repeatedStringMatch(String a, String b) {
        int minRepeats = (int) Math.ceil((double) b.length() / a.length());
        StringBuilder repeated = new StringBuilder(a.repeat(minRepeats));

        // Check the minimum number of repeats
        if (repeated.toString().contains(b)) {
            return minRepeats;
        }

        // Append one more repeat and check again
        repeated.append(a);
        if (repeated.toString().contains(b)) {
            return minRepeats + 1;
        }

        // If not found, return -1
        return -1;
    }
}
