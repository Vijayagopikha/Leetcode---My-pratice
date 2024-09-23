/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
    struct ListNode* current = head;
    int c=0;
    while(current){
        c++;
        current = current->next;
    }
    int mid=c/2;
   
   /* int* result = (int*)malloc((c-mid+1) * sizeof(int));
    int j=0;
*/
    for(int i=0;i<mid;i++){
        head = head->next;
    }
  
   
    return head;
    
}