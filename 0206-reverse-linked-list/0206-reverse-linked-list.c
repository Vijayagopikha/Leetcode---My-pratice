/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
   struct ListNode *nextNode, *prevnode = NULL;
   struct ListNode *curr = head;
   while(curr != NULL){
        nextNode = curr->next;
        curr->next =  prevnode;
        prevnode = curr;
        curr = nextNode;
   }
    /*while(head){
        nextNode = head->next;
        head->next =  prevnode;
        prevnode = head;
        head = nextNode;
    }*/
    return prevnode;
}