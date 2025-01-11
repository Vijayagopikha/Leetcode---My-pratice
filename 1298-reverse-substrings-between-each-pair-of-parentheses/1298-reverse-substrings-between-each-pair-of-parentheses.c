char* reverseParentheses(char* s) {
    int len = strlen(s);
    int* ind_stack = (int*)malloc(len * sizeof(int));
    int ind_top = -1;
    char* res = (char*)malloc((len + 1) * sizeof(char));
    int res_len = 0;

    for (int i = 0; i < len; i++) {
        if (s[i] == '(') {
            ind_stack[++ind_top] = res_len;
        } else if (s[i] == ')') {
            int start_ind = ind_stack[ind_top--];
            for (int j = start_ind, k = res_len - 1; j < k; j++, k--) {
                char temp = res[j];
                res[j] = res[k];
                res[k] = temp;
            }
        } else {
            res[res_len++] = s[i];
        }
    }

    res[res_len] = '\0';
    free(ind_stack);
    return res;
}