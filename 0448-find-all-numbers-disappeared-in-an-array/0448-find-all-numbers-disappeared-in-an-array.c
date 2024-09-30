/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* findDisappearedNumbers(int* nums, int numsSize, int* returnSize) {
    int* presence = (int*)calloc(numsSize, sizeof(int));
    int* result = (int*)malloc(numsSize * sizeof(int));
    int count = 0;

    // Step 2: Mark the presence of each number
    for (int i = 0; i < numsSize; i++) {
        presence[nums[i] - 1] = 1; // Mark the number as present
    }

    // Step 3: Collect the missing numbers
    for (int i = 0; i < numsSize; i++) {
        if (presence[i] == 0) {
            result[count++] = i + 1; // Store missing number
        }
    }

    // Step 4: Free the allocated memory for presence
    free(presence);
    
    // Set return size
    *returnSize = count;
    
    return result;

}