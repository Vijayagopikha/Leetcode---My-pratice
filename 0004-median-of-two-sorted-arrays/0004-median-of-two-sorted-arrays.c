double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    int l1 = nums1Size;
    int l2 = nums2Size;
    int arr[l1+l2];
    int k=0;
    for(int i=0;i<l1;i++){
        arr[k]=nums1[i];
        k++;
    }
    for(int i=0;i<l2;i++){
        arr[k]=nums2[i];
        k++;
    }
    for(int i=0;i<k;i++){
        for(int j=i+1;j<k;j++){
           if(arr[i]>arr[j]){
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
           }
        }
    }
    int tot = l1+l2;
    if(tot%2!=0){
        return (double)(arr[tot/2]);
    }
    else{
        int l = arr[tot/2 -1];
        int r = arr[tot/2];
        return (double)(l+r)/2.0;
    }
}
/*double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    // Ensure nums1 is the smaller array to minimize the binary search range
    if (nums1Size > nums2Size) {
        return findMedianSortedArrays(nums2, nums2Size, nums1, nums1Size);
    }

    int x = nums1Size;
    int y = nums2Size;
    int low = 0, high = x;

    while (low <= high) {
        int partitionX = (low + high) / 2;
        int partitionY = (x + y + 1) / 2 - partitionX;

        int maxX = (partitionX == 0) ? INT_MIN : nums1[partitionX - 1];
        int minX = (partitionX == x) ? INT_MAX : nums1[partitionX];

        int maxY = (partitionY == 0) ? INT_MIN : nums2[partitionY - 1];
        int minY = (partitionY == y) ? INT_MAX : nums2[partitionY];

        // Check if we have found the correct partition
        if (maxX <= minY && maxY <= minX) {
            // If the total number of elements is even
            if ((x + y) % 2 == 0) {
                return ((double)fmax(maxX, maxY) + fmin(minX, minY)) / 2;
            } else { // If the total number of elements is odd
                return (double)fmax(maxX, maxY);
            }
        } else if (maxX > minY) {
            high = partitionX - 1;
        } else {
            low = partitionX + 1;
        }
    }

    // If we reach here, the arrays are not sorted correctly
    return -1;
}*/