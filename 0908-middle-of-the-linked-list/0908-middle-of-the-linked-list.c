/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* middleNode(struct ListNode* head) {
   /* struct ListNode* current = head;
     int count = 0;
    while(current){
        current = current->next;
        count++;
    }
    int mid = count/2;
    for(int i=0;i<mid;i++){
        head = head->next;
    }
    return head;*/

    struct ListNode *fast , *slow;
    fast=slow=head;
    while(fast!=NULL){
        fast = fast->next;
        if(fast!=NULL){
            slow = slow->next;
            fast = fast->next;
            
        }
    }
    return slow;
}