void swap(int *a,int *b){
    int t = *a;
    *a = *b;
    *b = t;
}
void reverse(int *a, int l, int r){
    while(l<r){
        swap(&a[l++],&a[r--]);
    }
}
void rotate(int* a, int n, int k) {
   //time limit exceed
   /* while(k--){
        int temp = a[n-1];
        for(int i=n-2;i>=0;i--){
            a[i+1] = a[i];
        }
        a[0] = temp;
    }
    */
    if(n!=1){
        k = k%n;
    reverse(a, 0 , n-1);
    reverse(a,k, n-1);
    reverse(a,0, k-1);
    }

}

